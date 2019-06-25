package com.llc.cloud.bus.core;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author llc
 * @Description
 * @Date 2019/6/25 16:40
 */
@Slf4j
@Component
public class EventBusPusher implements ApplicationContextAware {
    protected static EventBusPusher instance;

    @Autowired(required = false)
    private BusProperties busProperties;

    //@Value("${spring.profiles.active}")
    private String active="dev";

    @Autowired
    private ApplicationContext applicationContext;

    private EventBusPusher() {
        super();
    }

    @PostConstruct
    private final void init() {
        instance = this;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static boolean getBusEnabled() {
        return instance.busProperties.isEnabled();
    }

    public static String getBusId() {
        return instance.busProperties == null ? StringUtils.EMPTY : instance.busProperties.getId();
    }

    public static String getActive() {
        return instance.active == null ? StringUtils.EMPTY : instance.active;
    }

    /**
     * 推送同步事件
     *
     * @param event
     */
    public static <T extends ApplicationEvent> void syncPost(T event) {
//		if (event instanceof RemoteApplicationEvent) {
//			String id = instance.busProperties.getId();
//			RemoteApplicationEvent remoteEvent = (RemoteApplicationEvent) event;
//		}
        log.info("source [{}] syncPost event[{}]=[{}]", event.getSource(), event.getClass().getName());
        instance.applicationContext.publishEvent(event);
    }

    /**
     * 推送异步事件
     *
     * @param event
     */
    public <T extends RemoteApplicationEvent> void asyncPost(T event) {

    }
}
