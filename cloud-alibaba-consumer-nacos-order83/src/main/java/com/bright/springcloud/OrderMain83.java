package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-26 17:31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain83 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain83.class, args);
	}
}
