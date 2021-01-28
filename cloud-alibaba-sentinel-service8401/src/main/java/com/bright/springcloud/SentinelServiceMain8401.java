package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-28 17:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceMain8401 {
	public static void main(String[] args) {
		SpringApplication.run(SentinelServiceMain8401.class, args);
	}
}
