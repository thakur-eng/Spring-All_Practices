package com.kodewala.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer   // Activates config server features 
public class MicroServicesDemoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesDemoConfigServerApplication.class, args);
	}

}
