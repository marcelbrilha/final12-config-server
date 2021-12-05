package com.final12.final12configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Final12ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Final12ConfigServerApplication.class, args);
	}

}
