package com.llc.cloud.bus.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;


@Component
public class ServiceInstanceUtils implements ApplicationContextAware{

	protected static ServiceInstanceUtils instance;
	
	@SuppressWarnings("unused")
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@PostConstruct
	private final void init() {
		instance = this;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public static int getInstanceNum(String serviceId) {
		List<ServiceInstance> instances = instance.discoveryClient.getInstances(serviceId);
		return instances == null ? 0 : instances.size();
	}
}
