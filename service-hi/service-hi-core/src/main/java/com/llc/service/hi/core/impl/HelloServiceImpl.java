package com.llc.service.hi.core.impl;

import com.llc.cloud.bus.core.EventBusPusher;
import com.llc.cloud.bus.event.hi.HelloEvent;
import com.llc.service.hi.api.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author llc
 * @Description
 * @Date 2019/6/19 10:15
 */
@RestController
public class HelloServiceImpl implements HelloService {
    @Value("${server.port}")
    private String port;

    @Value("${mytest}")
    private String mytest;

    @Override
    public String sayHello() {
        return "hello,world"+mytest;
    }

    @Override
    public String testEvent() {
        EventBusPusher.syncPost(new HelloEvent(this,"llc"));
        return "123";
    }
}
