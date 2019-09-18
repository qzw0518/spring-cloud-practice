package com.wind.consumer.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: zhiwen.qi@hand-china.com
 * @date: 2019/9/2
 */
@RestController
public class HelloClientController {
	@Autowired
	HelloClient helloClient;

	@GetMapping("/feign-consumer")
	public String helloConsumer(){
		return helloClient.hello();
	}
}
