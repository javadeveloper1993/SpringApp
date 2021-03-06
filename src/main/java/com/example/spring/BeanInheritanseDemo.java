package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.model.Customer;
import com.example.spring.model.Customer_Inheritancea;

/**
 * @author Maulik
 * 
 */
public class BeanInheritanseDemo {
	static Logger logger = Logger.getLogger(ApplicationContextDemo.class);

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

//		Customer customer = applicationContext.getBean(Customer.class,
//				"customerTemplate");
//		System.out.println("\n"+customer);

		Customer_Inheritancea customer_Inheritancea = applicationContext
				.getBean(Customer_Inheritancea.class,
						"customerInheritanceTemplate");
		System.out.println(customer_Inheritancea+"\n");

		applicationContext.close();

	}

}
