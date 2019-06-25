package com.llc.cloud.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@RemoteApplicationEventScan(basePackages = "com.llc.cloud.bus.event.*")
@ComponentScan(basePackages = {"com.llc.cloud.*"})
@SpringBootApplication
@EnableEurekaClient
public class CloudBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBusApplication.class, args);
    }

}
