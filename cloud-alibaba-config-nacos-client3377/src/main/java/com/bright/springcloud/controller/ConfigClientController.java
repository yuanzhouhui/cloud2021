package com.bright.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-26 17:58
 */
@RestController
@RefreshScope
public class ConfigClientController {

	@Value("${config.info}")
	private String configInfo;

	@GetMapping(value = "/config/info")
	public String getConfigInfo() {
		return configInfo;
	}
}
