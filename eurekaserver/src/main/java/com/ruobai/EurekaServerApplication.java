package com.ruobai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * SpringBootApplication:声明该类是springboot的服务入口
 * EnableEurekaServer:声明该类是一个Eureka Server微服务,提供服务注册和服务发现功能，即注册中心
 * */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class);
    }
}
