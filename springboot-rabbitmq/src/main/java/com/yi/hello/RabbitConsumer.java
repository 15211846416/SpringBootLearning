package com.yi.hello;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RabbitConsumer {
    public static final String exchange_name = "exchange_demo";
    public static final String routing_key = "routingkey_demo";
    public static final String queue_name = "queue_demo";
    public static final String ip_address = "192.168.152.103";
    public static final int port = 5672;

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        Address[] addresses = new Address[]{new Address(ip_address,port)};
        ConnectionFactory factory= new ConnectionFactory();
        factory.setUsername("guest");
        factory.setUsername("guest");
        factory.setPassword("guest");
//        factory.setPort(port); //连接方式和生产者不同
//        factory.setHost(ip_address);
        Connection connection = factory.newConnection(addresses);
        final Channel channel = connection.createChannel();
        channel.basicQos(64);//设置客户端最多接收未被ACK的信息
        Consumer consumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消息" + new String(body));
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                channel.basicAck(envelope.getDeliveryTag(),false);
            }
        };
        channel.basicConsume(queue_name,consumer);
        //等待回调完毕 关闭资源
        TimeUnit.SECONDS.sleep(5);
        channel.close();
        connection.close();

    }
}
