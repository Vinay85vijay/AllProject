package com.practise.jwt.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
public String home() {
	return "welcome and do more practise";
}
}
