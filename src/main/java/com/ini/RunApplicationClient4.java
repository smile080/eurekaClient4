package com.ini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import feign.Logger;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class RunApplicationClient4 {

	@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RunApplicationClient4.class, args);
	}
	
}
