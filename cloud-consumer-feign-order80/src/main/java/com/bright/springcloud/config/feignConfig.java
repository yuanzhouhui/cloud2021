package com.bright.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-21 16:46
 */
@Configuration
public class feignConfig {
	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
}
