package com.example.spring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author Maulik
 * 
 */
public class MyEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

	public void publish() {
		this.publisher.publishEvent(new MyCustomeEvent(this));
	}

}
