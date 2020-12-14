package com.ust.pms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int registrationId;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	
	UserRegistration(){}

	public UserRegistration(int registrationId, String firstname, String lastname, String username, String password) {
		super();
		this.registrationId = registrationId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegistration [registrationId=" + registrationId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	

}
