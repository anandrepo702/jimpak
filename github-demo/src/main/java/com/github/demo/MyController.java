package com.github.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test")
	public String get() {
		return "Git Set ra chichhaaaaaaaaaaaaaaaaaaaaaaa";
	}
}
