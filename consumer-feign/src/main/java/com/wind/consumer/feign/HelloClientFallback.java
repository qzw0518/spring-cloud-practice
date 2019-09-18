package com.wind.consumer.feign;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @version: 1.0
 * @author: zhiwen.qi@hand-china.com
 * @date: 2019/9/2
 */
@Component
public class HelloClientFallback implements HelloClient{
	@Override
	public String hello() {
		return "hello error";
	}
}
