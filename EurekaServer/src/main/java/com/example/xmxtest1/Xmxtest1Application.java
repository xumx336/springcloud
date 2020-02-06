package com.example.xmxtest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * 功能描述：创建服务注册中心
 * @author: xumx   
 * @date: 2020年2月6日 下午4:43:10
 */
@EnableEurekaServer
@SpringBootApplication
public class Xmxtest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Xmxtest1Application.class, args);
	}

}
