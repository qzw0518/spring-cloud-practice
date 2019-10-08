package com.wind.rabbitmq.hello.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhiwen.qi@hand-china.com
 * @version 1.0
 * @ClassName DemoReceiver
 * @description
 * @date 2019/9/27 15:32
 * @since JDK 1.8
 */
@Component
@RabbitListener(queues = "hello")
public class DemoReceiver {

    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver: " + hello);
    }
}
