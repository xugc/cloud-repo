/**
 * @Title UserProvider.java
 * @Package com.gc.cloud.service.config.client.provider
 * @Description TODO
 * Copyright: Copyright (c) 2017 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2017-7-20 下午3:19:58
 * @version V1.0
 */
package com.gc.cloud.service.config.client.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserProvider
 * @Description TODO
 * 
 */
@RestController
@RefreshScope
public class UserProvider {
	@Value("${app.url}")
	private String url;

	@RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
	public String getUserInfo(@PathVariable("name") String name) {
		return url + ":get:" + name;
	}

	@RequestMapping(value = "/user/{name}", method = RequestMethod.POST)
	public String createUserInfo(@PathVariable("name") String name,
			@RequestParam("phone") String phone) {
		return url + ":create:" + name;
	}

	@RequestMapping(value = "/user/{name}", method = RequestMethod.DELETE)
	public String deleteUserInfo(@PathVariable("name") String name) {
		return url + ":delete:" + name;
	}

	@RequestMapping(value = "/user/{name}", method = RequestMethod.PUT)
	public String updateUserInfo(@PathVariable("name") String name,
			@RequestParam("phone") String phone) {
		return url + ":update:" + name;
	}

}
