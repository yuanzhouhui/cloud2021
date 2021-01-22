package com.bright.springcloud.controller;

import com.bright.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

	@Resource
	private PaymentHystrixService paymentHystrixService;

	@GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
	String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentHystrixService.paymentInfo_OK(id);
		return result;
	}

	@GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
	/*@HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
	})*/
	@HystrixCommand
	String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
		//int age=10/0;
		String result = paymentHystrixService.paymentInfo_TimeOut(id);
		return result;
	}

	String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id){
		return "我是消费者80,对方支付系统繁忙,请稍后再试或自身运行出错,o(╥﹏╥)o";
	}

	//全局fallback方法
	String payment_Global_FallbackMethod(){
		return "Global异常处理信息,请稍后再试,o(╥﹏╥)o";
	}
}
