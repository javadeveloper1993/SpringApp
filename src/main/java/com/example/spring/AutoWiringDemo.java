package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.model.AutoWiringOne;

/**
 * @author Maulik
 * 
 */
public class AutoWiringDemo {

	static Logger logger = Logger.getLogger(ApplicationContextDemo.class);

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"ApplicationAutoWiringContext.xml");

		AutoWiringOne autoWiringOne = applicationContext.getBean(
				AutoWiringOne.class, "autoWiringByConstructor");

		logger.info(autoWiringOne + "\n");

		applicationContext.close();
	}

}
