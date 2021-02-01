package com.bright.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-02-01 14:48
 */
@Configuration
@MapperScan({"com.bright.springcloud.alibaba.dao"})
public class MybatisConfig {
}
