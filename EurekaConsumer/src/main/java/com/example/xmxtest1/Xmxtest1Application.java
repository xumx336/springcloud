package com.example.xmxtest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * 功能描述：创建应用主类，初始化RestTemplate,用来真正发起REST请求
 * @author: Administrator   
 * @date: 2020年2月6日 下午4:43:39
 */
@EnableEurekaClient
@SpringBootApplication
public class Xmxtest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Xmxtest1Application.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
