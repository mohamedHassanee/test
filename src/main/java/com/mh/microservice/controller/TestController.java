package com.mh.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mh.microservice.model.User;
import com.mh.microservice.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService service ;
	@GetMapping("/test")
	User test() {
		User user  =new User();
		user.setId(1L);
		user.setUserName("mohamed");
		user.setPassword("123");
		String hello = service.sayHello();
		
		return user;
	}
}
