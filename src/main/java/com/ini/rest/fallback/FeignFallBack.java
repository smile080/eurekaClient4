package com.ini.rest.fallback;

import org.springframework.stereotype.Component;

import com.ini.rest.service.ConsumerFeignService;

@Component
public class FeignFallBack implements ConsumerFeignService{

	@Override
	public String HelloService(String name) {
		return null;
	}
 
}
