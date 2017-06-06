package com.rcmutha.HibernateSample.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String city, String street, String pincode) {
		super();
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}

	private String city;
	private String street;
	private String pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
