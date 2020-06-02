package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/main")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET, value ="/hello")
	public String message() {
		return "<h1>Hello from Controller<h1>";		
	}
}
