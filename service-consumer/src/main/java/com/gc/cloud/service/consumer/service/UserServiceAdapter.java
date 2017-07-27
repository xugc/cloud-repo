/**
 * @Title UserServiceAdapter.java
 * @Package com.gc.cloud.service.consumer.service
 * @Description TODO
 * Copyright: Copyright (c) 2017 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2017-7-28 上午10:40:11
 * @version V1.0
 */
package com.gc.cloud.service.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @ClassName UserServiceAdapter
 * @Description TODO
 * 
 */
@Service
public class UserServiceAdapter implements UserService {
	@Autowired
	RestTemplate restTemplate;

	@Override
	@HystrixCommand(fallbackMethod = "getUserFallBack")
	public String getUser(String name) {
		return restTemplate.getForEntity("http://hello-provider/user/" + name,
				String.class).getBody();
	}

	public String getUserFallBack(String param) {
		return "error,paramters[" + param + "]";
	}

}
