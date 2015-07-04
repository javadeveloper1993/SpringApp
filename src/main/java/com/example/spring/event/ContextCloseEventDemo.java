package com.example.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextCloseEventDemo implements
		ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		ApplicationContext applicationContext = event.getApplicationContext();
		System.out.println("ContextClosedEvent Called...!!! " + applicationContext.getBeanDefinitionCount());
	}


}
