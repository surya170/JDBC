package com.surya.dto;

public class AdminModel {

	private Long id;
	private String userName;
	private String email;
	private String password;
	private double earnings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

}