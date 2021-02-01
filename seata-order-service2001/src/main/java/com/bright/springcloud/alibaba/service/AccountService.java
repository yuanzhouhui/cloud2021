package com.bright.springcloud.alibaba.service;

import com.bright.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-02-01 14:30
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

	@PostMapping(value = "/account/decreate")
	CommonResult decreate(@RequestParam("userId") Long userId, @RequestParam("money") Long money);
}
