package com.example.spring.model;

/**
 * @author Maulik
 * 
 */
public class Customer {

	private int type;
	private String action;
	private String country;

	public int getType() {
		return type;
	}

	public String getAction() {
		return action;
	}

	public String getCountry() {
		return country;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Customer [type=" + type + ", action=" + action + ", country="
				+ country + "]";
	}

}
