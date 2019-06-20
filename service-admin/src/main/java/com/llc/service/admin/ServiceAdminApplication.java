package com.llc.service.admin;

import com.netflix.discovery.EurekaNamespace;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * 监控服务上下线
 */

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableEurekaClient
public class ServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ServiceAdminApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
