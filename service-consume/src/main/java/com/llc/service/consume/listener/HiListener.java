package com.llc.service.consume.listener;

import com.llc.cloud.bus.event.HelloEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author llc
 * @Description 测试接收事件
 * @Date 2019/6/25 13:59
 */
@Component
public class HiListener implements ApplicationListener<HelloEvent> {

    @Override
    public void onApplicationEvent(HelloEvent event) {
        System.out.println("11111111111"+event.getUsername());
    }
}
