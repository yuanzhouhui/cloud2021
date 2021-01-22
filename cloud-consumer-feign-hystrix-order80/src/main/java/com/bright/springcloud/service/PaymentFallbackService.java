package com.bright.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-22 16:04
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
	@Override
	public String paymentInfo_OK(Integer id) {
		return "PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
	}

	@Override
	public String paymentInfo_TimeOut(Integer id) {
		return "PaymentFallbackService fall back paymentInfo_TimeOut,o(╥﹏╥)o";
	}
}
