package com.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接收者
 *
 * Created by lwx on 2019/6/16.
 */
@Component
public class Receiver {

    /**
     * 接收消息，采用消息队列监听机制
     */
    @RabbitListener(queues = {"hello-queue"})
    public void process(String msg){
        System.out.println("receiver:"+msg);
    }
}
