package com.bright.springcloud.alibaba;

import com.bright.springcloud.alibaba.domain.CommonResult;
import com.bright.springcloud.alibaba.domain.Order;
import com.bright.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-02-01 14:44
 */
@RestController
public class OrderController {

	@Resource
	private OrderService orderService;

	@GetMapping(value = "/order/create")
	public CommonResult create(Order order) {
		orderService.create(order);
		return new CommonResult(200, "订单创建成功");
	}
}
