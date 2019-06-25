package com.llc.cloud.bus.listener;

import com.llc.cloud.bus.event.hi.HelloEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author llc
 * @Description   接收事件
 * @Date 2019/6/24 17:39
 */
//@Component
//public class HelloListener implements ApplicationListener<HelloEvent> {
//
//
//    @Override
//    public void onApplicationEvent(HelloEvent event) {
//        String username = event.getUsername();
//        System.out.println(username+"--------------------");
//    }
//}