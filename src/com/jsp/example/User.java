package com.jsp.example;

public class User {
	private int userId;
	private String userName;
	private String email;
	private String password;
	private long phonoNo;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getPhonoNo() {
		return phonoNo;
	}
	public void setPhonoNo(long phonoNo) {
		this.phonoNo = phonoNo;
	}
	
}
