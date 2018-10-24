package com.ini.rest.configuration;

import org.springframework.context.annotation.Bean;
import feign.Logger;

public class FullLogConfiguration {

	@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
	
}
