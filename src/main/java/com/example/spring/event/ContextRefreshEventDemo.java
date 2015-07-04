package com.example.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshEventDemo implements
		ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		ApplicationContext applicationContext = event.getApplicationContext();
		System.out.println("ContextRefreshEventDemo Called...!!! " + applicationContext.getBeanDefinitionCount());
	}


}
