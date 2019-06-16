package com.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建消息队列
 *
 * Created by lwx on 2019/6/16.
 */
@Configuration
public class QueueConfig {
    //注意：Queue是 org.springframework.amqp.core.Queue;
    @Bean
    public Queue createQueue(){

        return new Queue("hello-queue");
    }
}
