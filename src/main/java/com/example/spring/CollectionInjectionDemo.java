package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.model.CollectionDemo;

/**
 * @author Maulik
 * 
 */
public class CollectionInjectionDemo {
	static Logger logger = Logger.getLogger(ApplicationContextDemo.class);

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		CollectionDemo collectionDemo = applicationContext.getBean(
				CollectionDemo.class, "collectionBean");
		System.out.println(collectionDemo + "\n");
		applicationContext.close();
	}

}
