package com.gc.cloud.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gc.cloud.service.consumer.service.UserService;

@RestController
public class ConsumerController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable("name") String name) {
		return userService.getUser(name);
	}
}