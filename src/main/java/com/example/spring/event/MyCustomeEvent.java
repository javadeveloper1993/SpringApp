package com.example.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Maulik
 *
 */
public class MyCustomeEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public MyCustomeEvent(Object source) {
		super(source);
	}

}
