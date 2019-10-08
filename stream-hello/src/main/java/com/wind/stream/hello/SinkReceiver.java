package com.wind.stream.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author zhiwen.qi@hand-china.com
 * @version 1.0
 * @ClassName SinkReceiver
 * @description
 * @date 2019/9/30 10:04
 * @since JDK 1.8
 */
@EnableBinding(Sink.class)
public class SinkReceiver {

    private static final Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("------Received:{}",payload);
    }

}
