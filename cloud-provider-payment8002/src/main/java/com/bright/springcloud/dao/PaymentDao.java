package com.bright.springcloud.dao;

import com.bright.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-18 15:34
 */
@Mapper
public interface PaymentDao {

	int create(Payment payment);

	Payment getPaymentById(@Param("id") Long id);
}
