package com.ini.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ini.rest.service.ConsumerFeignService;

@RestController
public class ConsumerRemoteController {
	
	@Autowired
	private ConsumerFeignService consumerFeignService;
	
    @RequestMapping(value="/feign-consumer",method=RequestMethod.GET)
    public String helloConsumer(@RequestParam("cusName") String cusName) {
        return consumerFeignService.helloService2(cusName);
      
    }
    
}
