package com.nh.model;

import lombok.Data;

@Data
public class City { 
	 private Integer pin;
	 private String name;
	 private String state;
	 
	 
	public City() {
		super();
	}

	public City(Integer pin, String name, String state) {
		super();
		this.pin = pin;
		this.name = name;
		this.state = state;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "City [pin=" + pin + ", name=" + name + ", state=" + state + "]";
	}
	 
	

}
