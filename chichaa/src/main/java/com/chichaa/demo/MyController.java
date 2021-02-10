package com.chichaa.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/chichaa")
	public String get() {
		return "Git Set ra chichhaaaaaaaaaaaaaaa";
	}
}
