package com.example.demoamir.users.models;



import com.example.demoamir.enums.Roles;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

////////////// Model of User ////////////////
@Entity
@Table
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String email;

	//to config spring security
	private boolean enabled=true;

	//to defined role user in model
	//a user can have "ADMIN" or "USER" role
	//This roles defined in enum structure
	@ElementCollection(targetClass = Roles.class)
	@CollectionTable(name ="authorities",joinColumns =	@JoinColumn(name="email",referencedColumnName = "email"))
	@Enumerated(EnumType.STRING)
	private List<Roles> role ;

	public User(){

	}
	public List<Roles> getRole() {
		return role;
	}

	public void setRole(List<Roles> role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}
