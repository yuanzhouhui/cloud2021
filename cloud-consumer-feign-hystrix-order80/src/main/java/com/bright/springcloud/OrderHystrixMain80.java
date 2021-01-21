package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-21 18:09
 */
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderHystrixMain80.class, args);
	}
}
