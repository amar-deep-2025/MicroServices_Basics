package com.amar.fullstack._Admin_Server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminServerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerMicroserviceApplication.class, args);
	}

}
