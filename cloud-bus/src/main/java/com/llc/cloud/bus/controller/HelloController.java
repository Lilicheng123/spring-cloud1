package com.llc.cloud.bus.controller;

import com.llc.cloud.bus.event.HelloEvent;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author llc
 * @Description
 * @Date 2019/6/24 17:41
 */
@RestController
public class HelloController implements ApplicationContextAware, ApplicationEventPublisherAware {

    // 时间发布器
    private ApplicationEventPublisher eventPublisher;

    //Spring上下文
    private ApplicationContext applicationContext;


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    @RequestMapping("/hello/{name}")
    public void hello(@PathVariable("name") String name){
        String id = applicationContext.getId();
        HelloEvent helloEvent = new HelloEvent(this,id,"**", name);
        eventPublisher.publishEvent(helloEvent);
    }
}
