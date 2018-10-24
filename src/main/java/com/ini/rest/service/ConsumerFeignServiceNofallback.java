package com.ini.rest.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ini.rest.configuration.DisableHystrixConfiguration;
import com.ini.rest.configuration.FullLogConfiguration;

@FeignClient(name="client1115",configuration= {DisableHystrixConfiguration.class,FullLogConfiguration.class})
public interface ConsumerFeignServiceNofallback {

	@GetMapping(value="/helloServer4/{cusName}")
	public String helloService2(@PathVariable("cusName") String cusName);
}
