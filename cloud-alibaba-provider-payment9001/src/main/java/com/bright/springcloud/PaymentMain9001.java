package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-26 15:52
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9001.class, args);
	}
}
