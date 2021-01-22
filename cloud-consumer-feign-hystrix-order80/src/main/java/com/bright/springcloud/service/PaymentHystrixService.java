package com.bright.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-21 18:10
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

	@GetMapping(value = "/payment/hystrix/ok/{id}")
	String paymentInfo_OK(@PathVariable("id") Integer id);

	@GetMapping(value = "/payment/hystrix/timeout/{id}")
	String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
