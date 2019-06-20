package com.llc.service.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages ={"com.llc.service.hi.*","com.llc.service.consume.*"})
@EnableFeignClients(basePackages = {"com.llc.service.hi.*","com.llc.service.consume.*"})
@EnableEurekaClient
public class ServiceConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumeApplication.class, args);
    }

}
