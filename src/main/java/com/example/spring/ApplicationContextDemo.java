package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.model.Person;

/**
 * @author Maulik
 * 
 */
public class ApplicationContextDemo {

	static Logger logger = Logger.getLogger(ApplicationContextDemo.class);

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
//		System.out.println("\ncontainsBean : "
//				+ applicationContext.containsBean("firstBeanPerson"));
//		System.out.println("ApplicationName : "
//				+ applicationContext.getApplicationName());
//		System.out.println("BeanDefinitionCount : "
//				+ applicationContext.getBeanDefinitionCount());
//		String beanName = "";
//		for (String bean : applicationContext.getBeanDefinitionNames()) {
//			beanName += bean + ", ";
//		}
//		System.out.println("BeanDefinitionNames :" + beanName);
//		System.out.println("Prototype : "
//				+ applicationContext.isPrototype("firstBeanPerson"));
//		System.out.println("Singleton : "
//				+ applicationContext.isSingleton("firstBeanPerson"));
//		System.out.println("ParentBeanFactory : "
//				+ applicationContext.getParentBeanFactory());
//		System.out.println("DisplayName : "
//				+ applicationContext.getDisplayName());
//		System.out.println("Id : " + applicationContext.getId());

		Person person = applicationContext.getBean("firstBeanPerson",
				Person.class);
		//System.out.println("\nperson1 : " + person);

		Person person1 = applicationContext.getBean("firstBeanPerson",
				Person.class);
		person1.setName("Maulik J");
		person1.setAge(10);
		person1.setAddress("Pratik Partk Flat");
		//System.out.println("person2 : " + person1);

		Person person2 = applicationContext.getBean("firstBeanPerson",
				Person.class);
		person2.setName("Maulik J Patel");
		person2.setAge(35);
		person2.setAddress("Pratik Partk Flat, Ranip");
		//System.out.println("person3 : " + person2);

//		System.out.println("\nperson1 Again : " + person);
//		System.out.println("person2 Again  : " + person1);
//		System.out.println("person3 Again : " + person2);

		person.setAddress(null);
		// System.out.println("\nperson1 Again1 : " + person);
		// System.out.println("person2 Again1  : " + person1);
		// System.out.println("person3 Again1 : " + person2);
		
		System.out.println("\n");
		applicationContext.close();

	}

}
