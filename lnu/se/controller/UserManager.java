package lnu.se.controller;

import lnu.se.model.UserQuery;

/**
 * This is a user manager class that manages users: createUser(), login(),signOut()
 * @author eyuel
 *
 */
public class UserManager {
	
	private UserQuery user =new UserQuery();
	
	public boolean login(String username,String password) {
		boolean isLogin=user.login(username,password);
		return isLogin;
	}
	public void logout() {
		
	}
	/**
	 * createUser-save the data filled by the user into the database
	 */
	public boolean createUser(String username, String password, String name, String status) {
		boolean isSignup=user.signup(username, password, name, status); 
		return isSignup;
	}
	/**
	 * viewAllUsers-search all users found in the database
	 */
	public void viewAllUsers() {
		user.findAllUsers();
	}
	/**
	 * searchUserByUserName-search user by user name
	 * @param username
	 */
	public void searchUserByUserName(String username) {
		user.findUser(username);
	}
	/**
	 * removeUser-delete a user from the database
	 * The criteria is user name which is a string
	 * @param username-a field used to delete user name. 
	 */
	public void removeUser(String username) {
		user.deleteUser(username);
	}
	
	
}
