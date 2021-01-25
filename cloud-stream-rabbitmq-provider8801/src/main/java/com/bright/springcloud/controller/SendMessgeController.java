package com.bright.springcloud.controller;

import com.bright.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-25 16:06
 */
@RestController
public class SendMessgeController {

	@Resource
	private IMessageProvider iMessageProvider;

	@GetMapping(value = "/sendMessage")
	public String sendMessage() {
		return iMessageProvider.send();
	}
}
