package com.bright.springcloud.alibaba.service;

import com.bright.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-02-01 14:30
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

	@PostMapping(value = "/storage/decreate")
	CommonResult decreate(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
