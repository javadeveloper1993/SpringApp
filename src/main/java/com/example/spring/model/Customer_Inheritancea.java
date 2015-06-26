package com.example.spring.model;

/**
 * @author Maulik
 * 
 */
public class Customer_Inheritancea {

	private String type;
	private String action;
	private String country;

	public void setType(String type) {
		this.type = type;
	}

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

	@Override
	public String toString() {
		return "Customer_Inheritancea [type=" + type + ", action=" + action
				+ ", country=" + country + "]";
	}

}
