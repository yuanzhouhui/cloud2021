package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-31 14:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentServiceMain9004 {
	public static void main(String[] args) {
		SpringApplication.run(NacosPaymentServiceMain9004.class, args);
	}
}
