package com.bright.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-25 14:40
 */
@RestController
@RefreshScope
@Slf4j
public class ConfigClientController {

	@Value("${server.port}")
	private String serverPort;

	@Value("${config.info}")
	private String configInfo;

	@GetMapping(value = "/configInfo")
	public String getConfigInfo() {
		return "serverPort: " + serverPort + "\t\t\t configInfo: " + configInfo;
	}
}
