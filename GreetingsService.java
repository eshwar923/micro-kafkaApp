package com.kafkaApp.controller;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;

import com.kafkaApp.streams.Greetings;
import com.kafkaApp.streams.GreetingsStreams;

@Service
public class GreetingsService {
	GreetingsStreams greStreams;
	
	
	public void sendGreeting(Greetings greetings) {
		System.out.println("send greetings: "+ greetings);
		MessageChannel mesageChnl = greStreams.outboundGreetings();
		mesageChnl.send(MessageBuilder.withPayload(greetings).setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
		
		
	}
	

}
