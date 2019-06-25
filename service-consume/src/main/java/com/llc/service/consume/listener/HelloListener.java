package com.llc.service.consume.listener;

import com.llc.cloud.bus.event.hi.HelloEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author llc
 * @Description
 * @Date 2019/6/25 17:25
 */
@Slf4j
@Component
public class HelloListener {
    @EventListener(classes = HelloEvent.class)
    public void handlerTestEvent(HelloEvent event) throws Exception {
        log.info("其他服务取消订单 event [{}] = [{}]", event.getClass().getName(),event.getUsername());
    }
}