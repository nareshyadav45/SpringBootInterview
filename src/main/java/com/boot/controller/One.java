package com.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class One {

	@Value("${server_port}")
	private int portNumber;

	@GetMapping("/valuee")
	public void portumber() {

		System.out.println("Application Running With Port Number :" + portNumber);

	}
	

}
