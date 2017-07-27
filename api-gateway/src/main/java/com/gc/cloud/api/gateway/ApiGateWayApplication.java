package com.gc.cloud.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class ApiGateWayApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiGateWayApplication.class, args);
	}
}
