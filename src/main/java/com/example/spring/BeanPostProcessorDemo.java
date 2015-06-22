package com.example.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.example.spring.model.Person;

public class BeanPostProcessorDemo implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		Person person = (Person) bean;
		person.setBeanName("myCustomeBean");
		person.setName("Parth");
		person.setAddress("Surat");
		person.setAge(4);
		System.out
				.println("BeanPostProcessorDemo >>> postProcessBeforeInitialization : "
						+ person);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		Person person = (Person) bean;
		System.out
				.println("BeanPostProcessorDemo >>> postProcessAfterInitialization : "
						+ person);
		return bean;
	}

}
