package com.ini.rest.service.impl;

import org.springframework.stereotype.Component;

import com.ini.rest.service.ConsumerFeignService;

@Component
public class ConsumerFeignServiceImpl implements ConsumerFeignService{

	@Override
	public String HelloService() {
		return "this is feign service .hello," ;
	}

}
