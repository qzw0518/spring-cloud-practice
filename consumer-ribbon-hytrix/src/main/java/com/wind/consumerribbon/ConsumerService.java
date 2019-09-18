package com.wind.consumerribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @version: 1.0
 * @author: zhiwen.qi@hand-china.com
 * @date: 2019/9/2
 */
@Service
public class ConsumerService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "helloFallback")
	public String helloConsumer(){
		return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
	}

	public String helloFallback(){
		return "hello error";
	}

}
