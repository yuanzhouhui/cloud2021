package com.bright.springcloud.alibaba.dao;

import com.bright.springcloud.alibaba.domain.Order;

public interface OrderDao {

    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}