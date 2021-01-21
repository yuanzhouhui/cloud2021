package com.bright.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-21 14:56
 */
public interface LoadBalancer {
	ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
