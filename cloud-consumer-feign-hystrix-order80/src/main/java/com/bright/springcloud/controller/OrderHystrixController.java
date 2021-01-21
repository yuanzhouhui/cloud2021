package com.bright.springcloud.controller;

import com.bright.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-21 18:12
 */
@RestController
@Slf4j
public class OrderHystrixController {

	@Resource
	private PaymentHystrixService paymentHystrixService;

	@GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
	String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentHystrixService.paymentInfo_OK(id);
		return result;
	}

	@GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
	String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
		String result = paymentHystrixService.paymentInfo_TimeOut(id);
		return result;
	}
}
