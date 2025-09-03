package com.app.entity;

public class StudentEntity {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private Address address;
	
	
	public StudentEntity()
	{}
	
	public StudentEntity(int id, String name, String email, String password, Address address) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
	}
	
     public StudentEntity(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		
	}
     
     
	
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
