package com.mainapp;

public class Account {
private String username;
private String password;
private String fullname;
private String address;

public Account() {
	System.out.println("Account instantiated");
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

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Account [username=" + username + ", password=" + password + ", fullname=" + fullname + ", address="
			+ address + "]";
}

}
