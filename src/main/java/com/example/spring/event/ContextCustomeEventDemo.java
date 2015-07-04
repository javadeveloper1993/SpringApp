package com.example.spring.event;

import org.springframework.context.ApplicationListener;

/**
 * @author Maulik
 * 
 */
public class ContextCustomeEventDemo implements
		ApplicationListener<MyCustomeEvent> {

	@Override
	public void onApplicationEvent(MyCustomeEvent event) {
		System.out.println("ContextCustomeEventDemo Called...!!! ");
	}

}
