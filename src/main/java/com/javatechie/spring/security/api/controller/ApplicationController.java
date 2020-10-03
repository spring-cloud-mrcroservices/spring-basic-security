package com.javatechie.spring.security.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.security.api.bean.User;

@RestController
@RequestMapping("/rest/auth")
@CrossOrigin(origins = "*")
public class ApplicationController {

	@GetMapping("/login")
	public String login() {
		System.out.println("Hello.................");
		return "Login success !!";
	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		User user1=new User("1", "Sandip", "sandip@gmail.com", "982029292");
		User user2=new User("2", "Sandip", "sandip@gmail.com", "982029292");
		User user3=new User("3", "Sandip", "sandip@gmail.com", "982029292");
		User user4=new User("4", "Sandip", "sandip@gmail.com", "982029292");
		
		List<User> userList=new ArrayList<>();
		userList.add(user4);
		userList.add(user3);
		userList.add(user2);
		userList.add(user1);
		System.out.println("userList : "+userList.toString());
		return userList;
	}

}
