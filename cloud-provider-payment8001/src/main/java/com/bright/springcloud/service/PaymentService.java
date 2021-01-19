package com.bright.springcloud.service;

import com.bright.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-18 15:54
 */
public interface PaymentService {

	int create(Payment payment);

	Payment getPaymentById(@Param("id") Long id);
}
