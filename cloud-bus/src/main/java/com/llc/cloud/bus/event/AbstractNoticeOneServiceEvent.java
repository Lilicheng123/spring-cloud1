package com.llc.cloud.bus.event;

import com.llc.cloud.bus.core.EventBusPusher;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

//import com.utility.RandomUtil;

/**
 * 随机通知微服务实例中的一个
 * 
 * @date 2018年10月11日上午10:49:34
 */
@Slf4j
@Getter
@Setter
@NoArgsConstructor
@SuppressWarnings("serial")
public abstract class AbstractNoticeOneServiceEvent extends RemoteApplicationEvent {

	public AbstractNoticeOneServiceEvent(Object source) {
		super(source.getClass(), EventBusPusher.getBusId(), selectOneDestinationService());
		log.info("Build Event:[{}] OriginService:[{}], DestinationService:[{}]", this.getClass().getName(),
				this.getOriginService(), this.getDestinationService());
	}

	public static String selectOneDestinationService() {
		// TODO 从eureka获取服务器实例然后随机
		// String destination = RandomUtil.getRandomIntegerNot0(2).toString();
		// return "*-" + destination;
		return "*-" + EventBusPusher.getActive() + 1;
	}

}
