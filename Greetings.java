package com.kafkaApp.streams;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Builder
public class Greetings {
	private String message;
	private long timestamp;

}
