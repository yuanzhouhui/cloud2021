package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-25 14:39
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientMain3366.class, args);
	}
}
