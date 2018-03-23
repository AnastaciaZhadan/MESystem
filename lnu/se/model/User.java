package lnu.se.model;

import com.lnu.Interface.UserStatus;

public class User {
	 /* Name of a user */
	 private  String name;
	
	 private  String username;
	 private  String password;
	 
	 UserStatus status;
	 public User() {}
	  public User(String username, String password,String name, UserStatus status) {
		  this.username=username;
		  this.password=password;
		  this.name=name;
		  this.status=status;
		 }
	  public void setName(String name) {
		 this.name=name;
		 }
	  public String getName() {
		  return name;
		 }
	  public String getUserName() {
		  return username;
	  }
	  public String getPassword() {
		  return password;
		 }
	  public UserStatus getStatus() { 
		  return status;  
		}

	  public void setStatus(UserStatus status) {
	      this.status = status;
	  }
}
