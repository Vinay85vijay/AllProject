package com.springlearning.controller;


import com.springlearning.model.EMail;
import com.springlearning.service.MailSenderSpring;
import com.springlearning.util.ResignationEmailTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class EmailSender {
    @Autowired
    MailSenderSpring mailSenderSpring;

    @GetMapping("/sendmail")
    public void sendMessage() throws IOException {
        EMail email = new EMail();
        email.setTo("vvinnu48@gmail.com"); 
        email.setFrom("v.gouda85@gmail.com");
        email.setSubject("Resignation mail !");
      
        email.setContent(getResignationTemp());
		/*
		 * Map<String, Object> model = new HashMap<>(); model.put("firstName", "vinay");
		 * model.put("lastName", "kumar");
		 */ 
        mailSenderSpring.sendEmailWithTemplate(email);
        
        //mailSenderSpring.geContentFromTemplate(model);
    }
    
   public String getResignationTemp(){
	   ResignationEmailTemplate template = new ResignationEmailTemplate();
	  
    	String temp = template.getResignationTemp();
    	temp = temp.replaceAll(ResignationEmailTemplate.FIRST_NAME, "Vinay");
    	temp = temp.replaceAll(ResignationEmailTemplate.LAST_NAME, "kumar");
    	return temp;
    	
    }

}
