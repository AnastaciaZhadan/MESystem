package lnu.se.Interface;

/**
 * This enum defines the possible MessageType types for a {@code Message}. 
 *  @author eyuel
 */

public enum MessageStatus {
	/**
     * Defines a message type, when a server is connected.
     * 
     */
	 CONNECTED,
	 /**
	  * Defines a message type, when a server is disconnected.
	  * 
	  */
	 DISCONNECTED,
	 /**
	  * Defines a message type, when a user request.
	  */
	 USER, 
	 /**
	  * Defines a message type, when a server respond.
	  */
	 SERVER, 
	 /**
	  * Defines a message type, when a message is notification.
	  */
	 NOTIFICATION
}

