package com.gc.cloud.service.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 * 
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class, args);
	}
}
