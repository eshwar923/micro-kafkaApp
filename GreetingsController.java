package com.kafkaApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaApp.streams.Greetings;

@RestController
public class GreetingsController {
	GreetingsService gServ;

	
	@GetMapping("/greetings")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void greetings(@RequestParam("message") String message) {
		Greetings gre = Greetings.builder().message(message).timestamp(System.currentTimeMillis()).build();
		
		gServ.sendGreeting(gre);
	}
}
