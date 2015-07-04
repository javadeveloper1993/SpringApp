package com.example.spring.model;

/**
 * @author Maulik
 * 
 */
public class AutoWiringOne {

	private String id;
	private AutoWiringTwo autoWiringTwo;

	public AutoWiringOne(String id, AutoWiringTwo autoWiringTwo) {
		this.id = id;
		this.autoWiringTwo = autoWiringTwo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AutoWiringTwo getAutoWiringTwo() {
		return autoWiringTwo;
	}

	public void setAutoWiringTwo(AutoWiringTwo autoWiringTwo) {
		this.autoWiringTwo = autoWiringTwo;
	}

	@Override
	public String toString() {
		return "AutoWiringOne [id=" + id + ", autoWiringTwo=" + autoWiringTwo
				+ "]";
	}

}
