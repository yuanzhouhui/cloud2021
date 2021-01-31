package com.bright.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.bright.springcloud.entities.CommonResult;
import com.bright.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-31 14:14
 */
@RestController
public class RateLimitController {

	@GetMapping(value = "/byResource")
	@SentinelResource(value = "byResource", blockHandler = "handleException")
	public CommonResult byResource() {
		return new CommonResult(200, "按资源名称限流测试,OK", new Payment(2021L, "serial001"));
	}

	public CommonResult handleException(BlockException exception) {
		return new CommonResult(444, exception.getClass().getCanonicalName() + "\t 服务不可用！");
	}

	@GetMapping(value = "/rateLimit/byUrl")
	@SentinelResource(value = "byUrl")
	public CommonResult byUrl() {
		return new CommonResult(200, "按url限流测试,OK", new Payment(2020L, "seril002"));
	}
}
