package com.demo.microservices.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicesConfigServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesConfigServerDemoApplication.class, args);
	}

}
