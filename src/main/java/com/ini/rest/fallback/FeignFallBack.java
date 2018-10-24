package com.ini.rest.fallback;

import org.springframework.stereotype.Component;

import com.ini.rest.service.ConsumerFeignService;

@Component
public class FeignFallBack implements ConsumerFeignService{

	@Override
	public String helloService2(String cusName) {
		return "服务不可用!";
	}
 
}
