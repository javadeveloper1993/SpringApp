package com.example.spring.model;

/**
 * @author Maulik
 * 
 */
public class Customer {

	private String type;
	private String action;
	private String country;

	public String getAction() {
		return action;
	}

	public String getCountry() {
		return country;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [type=" + type + ", action=" + action + ", country="
				+ country + "]";
	}

}
