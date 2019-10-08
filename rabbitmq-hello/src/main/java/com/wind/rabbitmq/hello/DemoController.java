package com.wind.rabbitmq.hello;

import com.wind.rabbitmq.hello.sender.DemoSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhiwen.qi@hand-china.com
 * @version 1.0
 * @ClassName DemoController
 * @description
 * @date 2019/9/27 15:53
 * @since JDK 1.8
 */
@RestController
@RequestMapping(value = "/test")
public class DemoController {

    @Autowired
    private DemoSender sender;

    @GetMapping(value = "/invokeSender")
    public String invokeSender(){
        sender.send();
        return "sent";
    }
}
