package com.mcommerce.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
//@EnableDiscoveryClient
//@RefreshScope 
public class ZuulServerApplication {
	
//	@Bean 
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//			.route(r->r.path("/mcr/**")
//			.uri("lb://microservice-produits"))
//			.build();
//	}
//	
//	//@Bean
//	DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc , DiscoveryLocatorProperties dlp) {
//		return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
//	}

	public static void main(String[] args) {
		//logger.info("test"); 
		SpringApplication.run(ZuulServerApplication.class, args);
	}

}
