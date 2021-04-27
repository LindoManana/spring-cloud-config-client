package io.javatricks.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

	@Autowired
	private Environment environment;

	@GetMapping("/message")
	public String message() {

		return environment.getProperty("welcome.message");
	}

}
