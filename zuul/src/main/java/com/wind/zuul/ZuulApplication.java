package com.wind.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}


	@Bean
	public PatternServiceRouteMapper serviceRouteMapper() {  //自定义路由映射规则
		return new PatternServiceRouteMapper(
				"(?<name>^.+)-(?<version>v.+$)",  //服务名样式
				"${version}/${name}"  //访问地址前缀生成样式
		);
	}


}
