package com.bright.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-28 17:05
 */
@RestController
@Slf4j
public class FlowLimitController {

	@GetMapping(value = "/testA")
	public String testA() {
		return "-----------A";
	}

	@GetMapping(value = "/testB")
	public String testB() {
		log.info(Thread.currentThread().getName() + "\t" + "testB");
		return "-----------B";
	}

	@GetMapping(value = "/testD")
	public String testD() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//log.info("testD RT测试");
		log.info("testD 异常比例");
		int age = 10 / 0;
		return "-----------D";
	}

	@GetMapping(value = "/testE")
	public String testE() {
		log.info("testE 测试异常数");
		int age = 10 / 0;
		return "-----------E";
	}
}
