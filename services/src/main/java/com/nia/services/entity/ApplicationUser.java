package com.nia.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ApplicationUser {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	/*@OneToOne(mappedBy="applicationUser")
    private UserRegister userRegister;*/
	
	@OneToOne
    @JoinColumn(name="USER_REGISTER_ID")
    private UserRegister userRegister;

	public long getId() {
		return id;
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

	public UserRegister getUserRegister() {
		return userRegister;
	}

	public void setUserRegister(UserRegister userRegister) {
		this.userRegister = userRegister;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
