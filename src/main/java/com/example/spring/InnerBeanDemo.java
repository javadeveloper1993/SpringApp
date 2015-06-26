package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.model.InnerBean;

/**
 * @author Maulik
 * 
 */
public class InnerBeanDemo {
	static Logger logger = Logger.getLogger(ApplicationContextDemo.class);

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		InnerBean innerBean = applicationContext.getBean(
				InnerBean.class, "innerBean");
		System.out.println(innerBean + "\n");
		applicationContext.close();
	}

}
