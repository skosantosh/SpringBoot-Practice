package com.main.DTO;

import java.util.Date;

public class StudentDTO {
	private int id;
	private String fname;
	private String lname;
	private Date joindate;
	private String email;
	private String username;
	private String password;
	private String usertype;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", fname=" + fname + ", lname=" + lname + ", joindate=" + joindate + ", email="
				+ email + ", username=" + username + ", password=" + password + ", usertype=" + usertype + "]";
	}

}
