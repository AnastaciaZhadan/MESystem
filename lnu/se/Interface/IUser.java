package lnu.se.Interface;

import java.util.List;
import java.util.Map;

/**
**<p>A <code>IUser</code><T> is a generic interface contract that helps user
* to handle the methods like (signup(), login(),logout(),createGroup())
*
* @author Eyuel Belay
* @version 1.0
* @since   2018-03-22 
*/
public interface IUser<T> {

	/**
	 * signup- A contract to create user. 
	 * @param name-the name of the user that provided during sign up. 
	 * @param username- a string character that the user provide for user name during sign up. 
	 * @param password- a string character that the user provide during sign up.
	 * @param status-a status of the user. The possible user status are <code>{NEW, ONLINE, ACTIVE, AWAY}</code>
	 * @see UserStatus 
	 * @return-return true is user is able to sign up, or false otherwise.
	 */
	public boolean signup(String name, String username, String password, String status);
	/**
	 * login-this contract helps user to login to the system.
	 * @param username-String character, user name, required when user tries to login to the system.
	 * @param password-String character , password,  required when user tries to login to the system.
	 * @return- true if user is able to login, or false otherwise.
	 */
	public boolean login(String username, String password);
	/**
	 * This contract may be required(not yet decided)
	 * This contract helps user to login to the system like the above method but here
	 * User are required to provide host name
	 * @param username
	 * @param password
	 * @param host-host name or ip-address of this computer( example: 127.0.0.1 or local host ) that is a string of characters.
	 * @param port-integer numer
	 * @return
	 */
	
	//public boolean login(String username, String password,String host, int port);
	
	/**
	 * createChatGroup- enables user to create chat group
	 * @param name-name of a chat group
	 * @param users-list of users included in the chat group
	 * @return- true if chat group is created,or false otherwise
	 */
	public boolean createChatGroup(String name, List<T> users);
	/**
	 * This method maps a given host name to a particular user.
	 * Example {127.0.0.1->user A, 127.0.0.2->user B, etc}
	 * @param users_In_chat: Map<String, T> where String is a host and T is a particular user.  
	 * 
	 */
	public void creatClientInChat(Map<String, T> users_In_chat );
	/**
	 * This API helps user to logout from the system.
	 * @return true if user be able to logout from the system.
	 * 
	 */
	public boolean logout();
}
