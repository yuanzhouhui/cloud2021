package com.bright.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-21 17:15
 */
@Service
public class PaymentService {
	public String paymentInfo_OK(Integer id) {
		return "线程池:" + Thread.currentThread().getName() + " paymentInfo_OK,id:" + id + "\t" + "O(∩_∩)O哈哈~";
	}

	public String paymentInfo_TimeOut(Integer id) {
		int timenumber = 3;
		try {
			TimeUnit.SECONDS.sleep(timenumber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "线程池:" + Thread.currentThread().getName() + " paymentInfo_TimeOut,id:" + id + "\t" + "O(∩_∩)O哈哈~";
	}
}
