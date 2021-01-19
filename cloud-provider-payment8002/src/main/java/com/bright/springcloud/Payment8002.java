package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-19 15:32
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8002 {
	public static void main(String[] args) {
		SpringApplication.run(Payment8002.class, args);
	}
}
