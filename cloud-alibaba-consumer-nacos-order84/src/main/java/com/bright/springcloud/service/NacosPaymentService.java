package com.bright.springcloud.service;

import com.bright.springcloud.entities.CommonResult;
import com.bright.springcloud.entities.Payment;
import com.bright.springcloud.service.impl.NacosPaymentServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-31 15:51
 */
@FeignClient(value = "nacos-payment-provider", fallback = NacosPaymentServiceImpl.class)
public interface NacosPaymentService {

	@GetMapping(value = "/payment/{id}")
	CommonResult<Payment> paymentSql(@PathVariable("id") Long id);
}
