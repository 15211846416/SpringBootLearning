package com.yi.Server;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * Created by 小飞 on 2019/8/19.
 */
public class RabbitConfigTest {
     AtomicInteger i = new AtomicInteger();


    public void method(String a){

        i.getAndIncrement();
    }

    public static void main(String[] args) throws InterruptedException {
        RabbitConfigTest rabbitConfigTest = new RabbitConfigTest();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0;i < 100000;i++){
                            rabbitConfigTest.method("1");
                        }
                    }
                }
        ).start();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0;i < 100000;i++){
                            rabbitConfigTest.method("2");
                        }
                    }
                }
        ).start();
        Thread.sleep(20);
        System.out.println(rabbitConfigTest.i);
    }
}