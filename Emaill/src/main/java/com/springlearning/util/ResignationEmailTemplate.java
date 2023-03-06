package com.springlearning.util;

import lombok.Data;

public class ResignationEmailTemplate {
	
	public static String FIRST_NAME = "<First_Name>";
	public static String LAST_NAME = "<Last_Name>";
	
	String resignationTemp = "<!DOCTYPE html><html><body style=\"background-color: #222533; padding: 20px; font-family: font-size: 14px; line-height: 1.43;>\r\n"
			+ "Dear "+ FIRST_NAME +","
			+ "Sending Email using Spring 4 with FreeMarker template"
			+ "<br><br>Thanks"
			+ "    </div></body></html>";
		
 	private String temp = "<html>"
			+ "<head></head>"
			+ "<body>"
			+ "Dear "+ FIRST_NAME+","
			+ "Sending Email using Spring 4 with <b>FreeMarker template !!!</b>"
			+ "<br>Thanks"
			+ "</body>"
			+ "</html>";

	public String getResignationTemp() {
		return resignationTemp;
	}

	public void setResignationTemp(String resignationTemp) {
		this.resignationTemp = resignationTemp;
	}

}
