package com.gc.cloud.service.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 * 
 */
@SpringBootApplication
@WebAppConfiguration
@RestController
public class App {
	@Value("${app.url}")
	private String url;

	@RequestMapping("/hello")
	public String helloWord() {
		return url;
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
