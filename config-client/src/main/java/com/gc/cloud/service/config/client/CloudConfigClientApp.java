package com.gc.cloud.service.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 * 
 */
//@SpringCloudApplication
@RestController
@SpringCloudApplication
public class CloudConfigClientApp {
	@Value("${app.url}")
	private String url;

	@RequestMapping("/hello")
	public String helloWord() {
		return url;
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigClientApp.class, args);
	}
}
