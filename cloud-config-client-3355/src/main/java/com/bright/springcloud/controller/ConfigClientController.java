package com.bright.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-23 17:18
 */
@RestController
public class ConfigClientController {

	@Value("${config.info}")
	private String configInfo;

	@GetMapping(value = "/configInfo")
	public String getConfigInfo() {
		return configInfo;
	}
}
