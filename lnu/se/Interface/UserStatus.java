package lnu.se.Interface;

/**
 * This enum defines the possible UserStatus types for a {@code User}. 
 */
public enum UserStatus {
	/**
	  * Define a user status when user is sign up for the first time.
	  */
	 NEW,
	/**
     * Defines a user status, when a user is logged in to the system.
     * 
     */
	 ONLINE, 
	 /**
	  * Defines a user status when a user is logged out from the system.
	  * 
	  */
	 AWAY, 
	 /**
	  * Defines a user status when a user is in a chat.
	  * 
	  */
	 ACTIVE
	 
}
