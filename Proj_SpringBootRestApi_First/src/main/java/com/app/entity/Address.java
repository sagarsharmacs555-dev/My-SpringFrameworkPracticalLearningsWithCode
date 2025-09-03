package com.app.entity;

public class Address {
	
	private String streetNo;
	private String nearBy;
	private int pincode;
	
	public Address()
	{}

	
	
	public Address(String streetNo, String nearBy, int pincode) {
		
		this.streetNo = streetNo;
		this.nearBy = nearBy;
		this.pincode = pincode;
	}



	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getNearBy() {
		return nearBy;
	}

	public void setNearBy(String nearBy) {
		this.nearBy = nearBy;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
