package com.eric.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STORE_USERS")
public class User {
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="userId")
	@SequenceGenerator(name="userId", sequenceName="USER_ID_SEQUENCE", initialValue=1, allocationSize=1)
	private long id;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Column(name="USER_FNAME")
	private String firstName;
	
	@Column(name="USER_LNAME")
	private String lastName;
	
	@Column(name="USER_PASSWORD")
	private String password;
	
	/**
	 * Relational Mapping
	 */
	@Column(name="USER_ROLE")
	private UserRole role;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public User() {
		super();
	}

	public User(String email, String firstName, String lastName, UserRole role) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}

	public User(String email, String firstName, String lastName, String password, UserRole role) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.role = role;
	}
	
	

}
