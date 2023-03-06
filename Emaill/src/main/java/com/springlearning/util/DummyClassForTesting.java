package com.springlearning.util;

public class DummyClassForTesting {

	public static void main(String[] args) {
		
		 ResignationEmailTemplate template = new ResignationEmailTemplate();
		  
	    	String temp = template.getResignationTemp();
	    	temp =	temp.replaceAll(ResignationEmailTemplate.FIRST_NAME, "Vinay");
	    	temp =	temp.replaceAll(ResignationEmailTemplate.LAST_NAME, "kumar");
	    	System.out.println("Template ********  "+temp);
	}
}
