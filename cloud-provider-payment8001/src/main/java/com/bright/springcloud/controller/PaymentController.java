package com.bright.springcloud.controller;

import com.bright.springcloud.entities.CommonResult;
import com.bright.springcloud.entities.Payment;
import com.bright.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-18 15:58
 */
@Controller
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@PostMapping(value = "/payment/create")
	@ResponseBody
	public CommonResult create(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		log.info("***插入结果:" + result);
		if (result > 0) {
			return new CommonResult(200, "插入数据库成功", result);
		} else {
			return new CommonResult(444, "插入数据库失败", null);
		}
	}

	@GetMapping(value = "/payment/get/{id}")
	@ResponseBody
	public CommonResult getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);
		if (payment != null) {
			return new CommonResult(200, "查询成功", payment);
		} else {
			return new CommonResult(444, "没有对应记录,查询Id" + id, null);
		}
	}
}
