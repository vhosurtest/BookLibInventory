package com.aryans.library.services.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test") 
public class TestService {

	@GetMapping("/greet")
	public String getGreeted() {
		return "First Spring app !!";
	}
}
