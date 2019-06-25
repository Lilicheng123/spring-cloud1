package com.llc.cloud.bus.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 需要UserId的事件
 * 
 * @author Zhang.Peng
 * @Date 2018年7月31日
 */
@Getter
@Setter
@NoArgsConstructor
@SuppressWarnings("serial")
public abstract class AbstractUserServiceEvent extends AbstractNoticeOneServiceEvent {

	protected Long userId;

	public AbstractUserServiceEvent(Object source, Long userId) {
		super(source);
		this.userId = userId;
	}
}
