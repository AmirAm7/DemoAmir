package com.example.demoamir.users.models;


import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	@Column(unique = true, updatable = false)
	private  String username;
	private  String password;
	@Column(unique = true)
	private  String email;
	private String address;
	private boolean enabled=true;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
