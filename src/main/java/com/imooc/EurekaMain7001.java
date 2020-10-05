package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @vlog:
 * @description:
 * @author: Rocky
 * @createDate: 2020/9/25 15:45
 */
@SpringBootApplication
//开启Eureka注册中心服务(提供者)。表示当前模块为Eureka注册中心
@EnableEurekaServer
public class EurekaMain7001 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaMain7001.class,args);
	}
}
