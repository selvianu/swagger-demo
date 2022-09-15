package com.chainsys.swaggerdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.swaggerdemo.model.User;

@RestController
@RequestMapping("/api/users")
public class HomeController {
	private static List<User> users = new ArrayList<User>();

	/*@GetMapping("/home")
	public String welcome() {
		return "Welcome";
	}

	@GetMapping("/userlist")
	public String userList() {
		return "userList";
	}*/

	@GetMapping
	public List<User> listOfUsers() {
		return users;

	}
//when somebody else checks code, we need to say/document what args
	// has to be passed - manual documentation - manual update needed
	// Swagger - Automatic autogenerate documentation
	@PostMapping
	public User addUser(@RequestBody User user) {
		users.add(user);
		System.out.println("User added");
		return user;
	}
}
