package com.samagra.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableKafka
@EnableAsync
@EnableJpaRepositories("com.samagra")
@EntityScan("com.samagra")
@ComponentScan(basePackages = {"com.samagra.Application","com.samagra","com.samagra.Provider.Factory"})
public class Outbound {
	public static void main(String[] args) {
		SpringApplication.run(Outbound.class, args);
	}
}
