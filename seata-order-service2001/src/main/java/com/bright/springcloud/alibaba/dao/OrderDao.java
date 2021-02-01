package com.bright.springcloud.alibaba.dao;

import com.bright.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {

    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //新建订单
    void create(Order order);

    //修改订单状态，0->1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}