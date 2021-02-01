package com.bright.springcloud.alibaba.service.impl;

import com.bright.springcloud.alibaba.dao.OrderDao;
import com.bright.springcloud.alibaba.domain.Order;
import com.bright.springcloud.alibaba.service.AccountService;
import com.bright.springcloud.alibaba.service.OrderService;
import com.bright.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-02-01 14:26
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderDao orderDao;

	@Resource
	private StorageService storageService;

	@Resource
	private AccountService accountService;

	@Override
	public void create(Order order) {
		log.info("---开始创建订单");
		orderDao.create(order);
		log.info("---开始调用库存,做数量扣减");
		storageService.decreate(order.getProductId(), order.getCount());
		log.info("---调用库存完成,完成数量扣减");
		log.info("---开始调用账户,做money扣减");
		accountService.decreate(order.getUserId(), order.getMoney());
		log.info("---调用账户完成,完成money扣减");
		//修改订单状态
		log.info("---开始修改订单状态");
		orderDao.update(order.getUserId(), 0);
		log.info("---完成修改订单状态");
		log.info("---订单生成完毕");
	}
}
