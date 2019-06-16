package com.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 *
 * Created by lwx on 2019/6/16.
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitAmqpTemplate;

    public void send(String msg) {
        /**
         * 参数一：消息队列名称
         * 参数二：消息
         */
        this.rabbitAmqpTemplate.convertAndSend("hello-queue",msg);
    }
}
