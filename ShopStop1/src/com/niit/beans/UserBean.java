package com.niit.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserBean {
	String useridmsg="user name entered is:";
	String passwordmsg="pswred entered is";
	String emailmsg="ur email id is";

	private String password;
	private String email;
	private String username;
	
	public UserBean() {
		super();
	}

	public String getPassword() {
		return ("<b>" + passwordmsg+ "<b>"+ this.password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return ("<b>" + emailmsg + "</b>" + this.email);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return ("<b>" + useridmsg + "</b>" + this.username);
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void getEmailid() {
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
			
			//opening a conncection
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.252.139:3306/temp_tlc","root","root");
			
			PreparedStatement s;
			s=con.prepareStatement("select email from customer where phone_no=? and password=?");
			s.setString(1, username);
			s.setString(2, password);
			ResultSet rs=s.executeQuery();
			
			while(rs.next()) {
				String str=rs.getString(1);
				setEmail(str);
				System.out.println(str);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
