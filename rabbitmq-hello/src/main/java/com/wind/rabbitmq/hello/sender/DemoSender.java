package com.wind.rabbitmq.hello.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author zhiwen.qi@hand-china.com
 * @version 1.0
 * @ClassName DemoSender
 * @description
 * @date 2019/9/27 15:30
 * @since JDK 1.8
 */
@Component
public class DemoSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hello" + new Date();
        System.out.println("Sender: " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
