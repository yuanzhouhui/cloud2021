package com.bright.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-21 14:19
 */
@Configuration
public class MySelfRule {
	@Bean
	public IRule myrule(){
		return new RandomRule();
	}
}
