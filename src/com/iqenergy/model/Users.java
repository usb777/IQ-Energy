package com.iqenergy.model;

import java.util.Date;

public class Users 
{
	private int id;
	private String fullname;
	private String email;
	private String username;
	private String password;
	private int role;
	private Date date_reg;
	
	
	
	
	
	public Users(int id, String fullname, String email, String username, String password, int role, Date date_reg )
	{   
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role  = role;
		this.date_reg = date_reg;
		
	}
	public Users()
	{}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}
	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the role
	 */
	public int getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(int role) {
		this.role = role;
	}
	
	
	public Date getDate_reg() 
	{
		return date_reg;
	}
	public void setDate_reg(Date date_reg) 
	{
		this.date_reg = date_reg;
	}
	
	@Override
	public String toString() 
	{// 
		
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + 
				", username="+username+", role="+role+"]";
	}
	

}
