package com.yi.hello;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitProducer {
    public static final String exchange_name = "exchange_demo";
    public static final String routing_key = "routingkey_demo";
    public static final String queue_name = "queue_demo";
    public static final String ip_address = "192.168.152.103";
    public static final int port = 5672;

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        //配置信息
        factory.setHost(ip_address);
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setPort(port);

        //
        Connection connection = factory.newConnection();//创建连接
        Channel channel = connection.createChannel();//创建信道
        channel.exchangeDeclare(exchange_name,"direct",true,false,null);//创建一个type = ‘direct’、持久化、非自动删除的交换器
        channel.queueDeclare(queue_name,true,false,false,null);//创建一个持久化、非排他的、非自动删除的队列
        //将交换器与队列通过路由键绑定
        channel.queueBind(queue_name,exchange_name,routing_key);
                //发送一条持久化的信息
        channel.basicPublish(exchange_name,routing_key,
                MessageProperties.PERSISTENT_TEXT_PLAIN,"hello world".getBytes());

        //关闭资源
        channel.close();
        connection.close();

    }
}
