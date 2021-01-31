package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-31 15:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain84 {
	public static void main(String[] args) {
		SpringApplication.run(NacosOrderMain84.class, args);
	}
}
