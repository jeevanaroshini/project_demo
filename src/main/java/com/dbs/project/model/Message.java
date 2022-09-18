package com.dbs.project.model;

public class Message {
	
	String messageCode;
	String description;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String messageCode, String description) {
		super();
		this.messageCode = messageCode;
		this.description = description;
	}
	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
