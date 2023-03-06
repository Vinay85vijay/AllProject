package com.mirafra.email.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirafra.email.dto.MailRequest;
import com.mirafra.email.dto.MailResponse;
import com.mirafra.email.mailservice.EmailService;


@RestController
public class EmailController {
	@Autowired
	
	 private EmailService service;
	@Autowired
	
	@RequestMapping("/")
	public String showHome() {
		return "index";
	}
	 
	@PostMapping("/sendingEmail")
	public MailResponse sendMail ( @RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("Location", "Bangalore , India");
		
		
	return	service.sendMail(request, model);
	}
}
