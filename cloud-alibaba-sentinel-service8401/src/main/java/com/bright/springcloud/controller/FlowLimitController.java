package com.bright.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-28 17:05
 */
@RestController
public class FlowLimitController {

	@GetMapping(value = "/testA")
	public String testA() {
		return "-----------A";
	}

	@GetMapping(value = "/testB")
	public String testB() {
		return "-----------B";
	}
}
