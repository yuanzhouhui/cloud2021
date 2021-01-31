package com.bright.springcloud.alibaba.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_order
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
	private Long id;

	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 产品id
	 */
	private Long productId;

	/**
	 * 数量
	 */
	private Integer count;

	/**
	 * 金额
	 */
	private Long money;

	/**
	 * 订单状态：0：创建中；1：已完结
	 */
	private Integer status;

	private static final long serialVersionUID = 1L;
}