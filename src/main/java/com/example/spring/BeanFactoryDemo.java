package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.model.Person;

/**
 * @author Maulik
 * 
 */
public class BeanFactoryDemo {

	static Logger logger = Logger.getLogger(BeanFactoryDemo.class);

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		Person person = beanFactory.getBean("firstBeanPerson", Person.class);
		logger.info(person);
	}

}
