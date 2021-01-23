package com.bright.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-23 14:46
 */
@Configuration
public class GateWatConfig {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
		RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
		routes.route("path_route_bright1", r -> r.path("/guonei")
				.uri("http://news.baidu.com/guonei")).build();
		return routes.build();
	}

	@Bean
	public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
		RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
		routes.route("path_route_bright2", r -> r.path("/guoji")
				.uri("http://news.baidu.com/guoji")).build();
		return routes.build();
	}
}
