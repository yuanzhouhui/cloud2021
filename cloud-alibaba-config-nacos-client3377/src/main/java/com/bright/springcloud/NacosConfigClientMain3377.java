package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-26 17:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
	public static void main(String[] args) {
		SpringApplication.run(NacosConfigClientMain3377.class, args);
	}
}
