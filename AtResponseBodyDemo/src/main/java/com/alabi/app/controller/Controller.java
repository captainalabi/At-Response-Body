package com.alabi.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alabi.app.entity.User;

/*
 * @ResponseBody enables you to be able to return
 * an object's properties in a json body
 * If you mark the controller class with @Controller, 
 * you will need to mark the method with @ResponseBody
 * but @RestController already encompasses @ResponseBody. 
 */

@RestController
public class Controller {

	
	@GetMapping("/users")
	public User getUser() {
		
		User	user = new User();
		user.setName("Good Man");
		user.setLocation("Nigeria");
		user.setAge(25);
		
		return user;
	}

}
