package com.biml.master.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/ping")
	public String index() {
		return "pong!";
	}

}
