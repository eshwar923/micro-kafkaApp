package com.kafkaApp.controller;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.kafkaApp.streams.Greetings;
import com.kafkaApp.streams.GreetingsStreams;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class GreetingsListener {
	@StreamListener(GreetingsStreams.INPUT)
	 public void handleGreetings(@Payload Greetings greetings) {
        System.out.println("Received greetings: {}"+ greetings);
    }
	

}
