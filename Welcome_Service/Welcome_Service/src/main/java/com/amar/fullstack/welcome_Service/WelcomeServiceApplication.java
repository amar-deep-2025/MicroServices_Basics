package com.amar.fullstack.welcome_Service.Welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class WelcomeServiceApplication {

	public static void main(String[] args)
	{
		System.out.println("Welcome Service Application Started");

		SpringApplication.run(WelcomeServiceApplication.class, args);

	}

}
