package com.example.spring.model;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanNameAware;

/**
 * @author Maulik
 * 
 */
public class Person implements BeanNameAware {

	Logger logger = Logger.getLogger(Person.class);

	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address
				+ "]";
	}

	public void open() {
		System.out
				.println("Person >>>>> Init Method Called...!!!" + toString());
	}

	public void destroye() {
		System.out.println("Person >>>>> Destroye Method Called...!!!"
				+ toString());
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("\nsetBeanName >>>>> " + name);
	}

}
