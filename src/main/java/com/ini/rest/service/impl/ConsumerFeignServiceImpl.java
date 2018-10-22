package com.ini.rest.service.impl;

import com.ini.rest.service.ConsumerFeignService;

public class ConsumerFeignServiceImpl implements ConsumerFeignService{

	@Override
	public String HelloService(String name) {
		return "this is feign service .hello," + name;
	}

}
