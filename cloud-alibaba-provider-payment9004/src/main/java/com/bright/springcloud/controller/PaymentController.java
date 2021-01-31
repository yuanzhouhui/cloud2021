package com.bright.springcloud.controller;

import com.bright.springcloud.entities.CommonResult;
import com.bright.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-31 14:53
 */
@RestController
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	public static HashMap<Long, Payment> hashMap = new HashMap<>();

	static {
		hashMap.put(1L, new Payment(1L, "2df0j45a09fjasdf079gjsf52"));
		hashMap.put(2L, new Payment(2L, "kjlhuiosdy78921kl890asdkl"));
		hashMap.put(3L, new Payment(3L, "2jd0u23klo;h89pgysfdhkf88"));
	}

	@GetMapping(value = "/payment/{id}")
	public CommonResult<Payment> paymentSql(@PathVariable("id") Long id) {
		Payment payment = hashMap.get(id);
		CommonResult<Payment> result = new CommonResult<>(200, " from mysql, serverPort: " + serverPort, payment);
		return result;
	}
}
