package com.ini.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ini.rest.service.ConsumerFeignService;
import com.ini.rest.service.impl.ConsumerFeignServiceImpl;

@RestController
public class ConsumerRemoteController {
	
	@Autowired
	private ConsumerFeignServiceImpl consumerFeignService;
	
    @RequestMapping(value="/feign-consumer",method=RequestMethod.GET)
    public String helloConsumer() {
        return consumerFeignService.HelloService();
      
    }
    
}
