package com.wind.consumerribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @version: 1.0
 * @author: zhiwen.qi@hand-china.com
 * @date: 2019/8/30
 */
@RestController
public class ConsumerController {

	@Autowired
	private ConsumerService consumerService;

	@GetMapping("/consumer-ribbon")
	public String helloConsumer(){
		return consumerService.helloConsumer();
	}

}
