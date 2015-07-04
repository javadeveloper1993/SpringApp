package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.spring.model.Person;

public class JavaBasedSpringExample {

	static Logger logger = Logger.getLogger(JavaBasedSpringExample.class);

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				JavaBasedConfig.class);

		Person person = applicationContext.getBean("person1", Person.class);
		logger.info(person);

		applicationContext.close();
		

	}

}
