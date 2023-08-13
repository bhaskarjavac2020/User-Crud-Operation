package com.bktech.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class JwtController {
	
	@GetMapping("/test")
	public String testApi() {
		return "Api is working..";
	}
}
