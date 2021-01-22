package com.bright.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-22 17:14
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixDashBoardMain9001 {
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashBoardMain9001.class, args);
	}
}
