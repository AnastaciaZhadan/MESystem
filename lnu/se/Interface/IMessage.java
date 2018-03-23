package lnu.se.Interface;

import java.time.LocalDateTime;
import java.util.List;

public interface IMessage<T> {
	/**
	 * sendMessage- To send a message from one client to another client. 
	 * @param message- the actual message the user send.
	 * @param from-a client of type T, String or User class, that sends a message . 
	 * @param to-a client of type T,type of User or name of user, that suppose to receive a message.
	 * @param timeSent-the time that a user send this message which is type of LocalDataTime which contains data & time but no time zone which is found in java.time
	 * @param status-status of a message type T which can be either string or MessageStatus class
	 * @return-true if a message is sent, false other wise.
	 */
	public boolean sendMessage(String message, T from, T to, LocalDateTime timeSent,T status);
	/**
	 * receivedMessage-This is when a message is received by the client.
	 * @param message-A string type of the actual message
	 * @param from-a client of type T, String or User class, that sends a message . 
	 * @param to-a client of type T,type of User or name of user, that suppose to receive a message.
	 * @param timeSent-LocalDataTime which contains data & time but no time zone which is found in java.time
	 * @param timeRecieve-LocalDataTime which contains data & time but no time zone which is found in java.time
	 * @return-true if a message is received, or false otherwise.
	 */
	
	public boolean receivedMessage(String message, T from, T to,LocalDateTime timeSent,LocalDateTime timeRecieve);
    /**
     * This method send a message from a client to the group.
     * @param message-the actual message of type string.
     * @param from-a client who send a message, a single user.
     * @param group-a group that receive this message.
     * @param timeSent-the time that the user send a message, type of LocalDataTime.
     * @param status-status of the message.
     * @return- true if a message has send.
     */
	public boolean sendMessageToGroup(String message, T from, List<T> to,LocalDateTime timeSent,T status);
	/**
	 * This method helps a client to receive a message from the chat group. 
	 * @param message-the actual message that has sent
	 * @param from- from the chat group
	 * @param to-message suppose to received by a user
	 * @param timeSent-a LocalDateTime that this message has sent.
	 * @param timeRecieve-a LocalDateTime that this message has received.
	 * @return- true if message is received,or false otherwise.
	 */
	public boolean receivedGroupMesage(String message, List<T> from, T to,LocalDateTime timeSent,LocalDateTime timeRecieve);
}
