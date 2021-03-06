package com.restfull.fullstackbackend.controller;

import org.apache.commons.text.WordUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfull.fullstackbackend.dto.HelloWorldBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello-world")
	public String helloWorld() {
		return "Hello from the other side";
	}
	
	@RequestMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
//		throw new RuntimeException("Some Error has Happened! Contact Support at ***_***");
		return new HelloWorldBean("Hello from the other side");
	}
	
	@RequestMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello from the other side, %s",WordUtils.capitalizeFully(name)));
	}

}
