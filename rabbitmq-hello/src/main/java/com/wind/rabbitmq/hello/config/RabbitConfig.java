package com.wind.rabbitmq.hello.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhiwen.qi@hand-china.com
 * @version 1.0
 * @ClassName RabbitConfig
 * @description
 * @date 2019/9/27 15:48
 * @since JDK 1.8
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
