package com.pk.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback(){
		return "user service is taking longer than expected";
	}
	
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallback(){
		return "department service is taking longer than expected";
	}
	
}
