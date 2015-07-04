package com.example.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStopEventDemo implements
		ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		ApplicationContext applicationContext = event.getApplicationContext();
		System.out.println("ContextStopEvent Called...!!! "
				+ applicationContext.getBeanDefinitionCount());
	}

}
