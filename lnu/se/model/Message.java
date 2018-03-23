package lnu.se.model;


import java.util.List;

import com.lnu.Interface.MessageStatus;

public class Message {

	private String message;
	private MessageStatus messageStatus;
	private List<User> users;
	
	public void setMessage(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public MessageStatus getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(MessageStatus status) {
		this.messageStatus=status;
	}
	public List<User> getListOfUsers(){
		return users ;
	}
	public void setListOfUser(List<User> users) {
		this.users=users;
	}
}
