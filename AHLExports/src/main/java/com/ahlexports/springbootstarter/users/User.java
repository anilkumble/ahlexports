package com.ahlexports.springbootstarter.users;

import javax.persistence.*;


@Entity
@Table(name="users")
public class User {
	
	@Id
	private String id;
	private String name;
	private String address;
			
	public User() {
		super();
	}
	
	public User(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
