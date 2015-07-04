package com.example.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartEventDemo implements
		ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		ApplicationContext applicationContext = event.getApplicationContext();
		System.out.println("ContextStartedEvent Called...!!! " + applicationContext.getBeanDefinitionCount());		
	}

}
