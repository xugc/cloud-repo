/**
 * @Title WebMvcConfiguration.java
 * @Package com.gc.cloud.service.config.client.config
 * @Description TODO
 * Copyright: Copyright (c) 2017 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2017-7-20 下午3:54:14
 * @version V1.0
 */
package com.gc.cloud.service.config.client.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

/**
 * @ClassName WebMvcConfiguration
 * @Description TODO
 * 
 */
@Configuration
public class WebMvcConfiguration {
	@Bean
	public FilterRegistrationBean<HiddenHttpMethodFilter> filterRegistrationBean() {
		FilterRegistrationBean<HiddenHttpMethodFilter> filterRegister = new FilterRegistrationBean<>();
		filterRegister.setFilter(new HiddenHttpMethodFilter());//_method
		return filterRegister;
	}
}
