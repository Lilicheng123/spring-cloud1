package com.llc.cloud.bus.event.hi;

import com.llc.cloud.bus.event.AbstractNoticeOneServiceEvent;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;


/**
 * @Author llc
 * @Description
 * @Date 2019/6/24 17:22
 */
@Getter
@Setter
@NoArgsConstructor
@SuppressWarnings("serial")
public class HelloEvent extends AbstractNoticeOneServiceEvent {


    private String username;

    @Builder
    public HelloEvent(Object source, String username) {
        super(source);
        this.username = username;
    }
}
