package com.wind.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @version: 1.0
 * @author: zhiwen.qi@hand-china.com
 * @date: 2019/9/2
 */
@FeignClient(value = "hello-service",fallback = HelloClientFallback.class)
public interface HelloClient {
	@GetMapping("/hello")
	String hello();
}
