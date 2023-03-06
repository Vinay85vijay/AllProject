package com.example.login;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.login.bean.User;

@RestController
public class UserController {
	public List<User> getAllCourses(){
		return Arrays.asList(new User(1,"vinay@gmail.com","vinay@123"));
	}

}
