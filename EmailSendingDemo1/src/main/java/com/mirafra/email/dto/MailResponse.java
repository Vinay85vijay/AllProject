package com.mirafra.email.dto;

public class MailResponse {
private String message;
private String status;
public MailResponse() {
	super();
	// TODO Auto-generated constructor stub
}

public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public MailResponse(String message, String status) {
	super();
	this.message = message;
	this.status = status;
}
}
