package com.wind.service.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @version: 1.0
 * @author: zhiwen.qi@hand-china.com
 * @date: 2019/8/30
 */
@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private Registration registration;

	@Autowired
	private DiscoveryClient client;

	@GetMapping("/hello")
	public String index(){
		logger.info("host:{}",registration.getHost());
		logger.info("instanceId:{}",registration.getInstanceId());
		logger.info("serviceId",registration.getServiceId());
		logger.info("port",registration.getPort());
		return "hello";
	}
}
