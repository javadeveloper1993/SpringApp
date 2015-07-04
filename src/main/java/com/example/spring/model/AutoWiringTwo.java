package com.example.spring.model;

/**
 * @author Maulik
 * 
 */
public class AutoWiringTwo {

	private String name;
	private String mode;
	
	public AutoWiringTwo() {
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AutoWiringTwo [name=" + name + ", mode=" + mode + "]";
	}

}
