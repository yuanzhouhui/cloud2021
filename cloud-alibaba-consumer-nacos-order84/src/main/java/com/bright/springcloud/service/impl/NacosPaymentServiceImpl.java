package com.bright.springcloud.service.impl;

import com.bright.springcloud.entities.CommonResult;
import com.bright.springcloud.entities.Payment;
import com.bright.springcloud.service.NacosPaymentService;
import org.springframework.stereotype.Component;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-31 15:54
 */
@Component
public class NacosPaymentServiceImpl implements NacosPaymentService {

	@Override
	public CommonResult<Payment> paymentSql(Long id) {
		return new CommonResult<>(444, "服务降级返回,---PaymentFallbackService,", new Payment(id, "errorService"));
	}
}
