package com.bright.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.bright.springcloud.entities.CommonResult;
import com.bright.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-31 15:04
 */
@RestController
@Slf4j
public class CircleBreakerController {

	public static final String SERVICE_URL = "http://nacos-payment-provider";

	@Resource
	private RestTemplate restTemplate;

	@RequestMapping("/consumer/fallback/{id}")
	//@SentinelResource(value = "fallback")//无配置
	@SentinelResource(value = "fallback", fallback = "handlerFallback")//只配fallback
	public CommonResult<Payment> fallback(@PathVariable("id") Long id) {
		CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL + "/payment/" + id, CommonResult.class, id);
		if (id == 4) {
			throw new IllegalArgumentException("IllegalArgumentException,非法参数");
		} else if (result.getData() == null) {
			throw new NullPointerException("NullPointerException,没有该id对应记录");
		}
		return result;
	}

	public CommonResult<Payment> handlerFallback(@PathVariable("id") Long id, Throwable e) {
		Payment payment = new Payment(id, null);
		return new CommonResult(444, "兜底异常handlerFallback,exception内容：" + e.getMessage(), payment);
	}
}
