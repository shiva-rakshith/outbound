package com.uci.outbound.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableKafka
@EnableAsync
@EnableReactiveCassandraRepositories("com.uci.dao")
@PropertySource("application-adapter.properties")
@PropertySource("application-messagerosa.properties")
@PropertySource("application.properties")
public class Outbound {
	public static void main(String[] args) {
		SpringApplication.run(Outbound.class, args);
	}
}