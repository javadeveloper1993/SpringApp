package com.example.spring.model;

/**
 * @author Maulik
 * 
 */
public class InnerBean {

	private Person person;
	private Customer customer;
	private Customer_Inheritancea customer_Inheritanes;

	public InnerBean(Person person, Customer_Inheritancea customer_Inheritanes) {
		super();
		this.person = person;
		this.customer_Inheritanes = customer_Inheritanes;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "InnerBean [person=" + person + ", customer=" + customer
				+ ", customer_Inheritanes=" + customer_Inheritanes + "]";
	}

}
