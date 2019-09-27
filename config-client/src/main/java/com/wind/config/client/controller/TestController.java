package com.wind.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhiwen.qi@hand-china.com
 * @version 1.0
 * @ClassName TestController
 * @description
 * @date 2019/9/27 11:19
 * @since JDK 1.8
 */
@RefreshScope
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Value("${from}")
    private String from;

    @Autowired
    private Environment env;

    @RequestMapping("/from-use-env")
    public String fromEnv(){
        return env.getProperty("from","undefined");
    }

    @RequestMapping("/from")
    public String from(){
        return this.from;
    }
}
