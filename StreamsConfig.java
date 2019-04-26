package com.kafkaApp.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.kafkaApp.streams.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {

}
