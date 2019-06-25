package com.llc.cloud.bus.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;


/**
 * @Author llc
 * @Description
 * @Date 2019/6/24 17:22
 */
@Getter
@Setter
public class HelloEvent extends RemoteApplicationEvent {

    public HelloEvent() {
    }

    private String username;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public HelloEvent(Object source, String originService, String destinationService, String username) {
        super(source, originService, destinationService);
        this.username = username;
    }

    public HelloEvent(Object source, String originService, String username) {
        super(source, originService);
        this.username = username;
    }
}
