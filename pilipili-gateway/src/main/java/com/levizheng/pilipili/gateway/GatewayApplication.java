package com.levizheng.pilipili.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author levi
 * @since 2024/4/13
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        log.info("网关服务启动中...");
        SpringApplication.run(GatewayApplication.class, args);
    }
}
