package com.ini.rest.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ini.rest.fallback.FeignFallBack;

@FeignClient(name="client1115",fallback=FeignFallBack.class)
public interface ConsumerFeignService {

	@GetMapping(value="/helloServer4/{cusName}")
	public String helloService2(@PathVariable("cusName") String cusName);
}
