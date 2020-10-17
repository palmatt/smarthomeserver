package com.smarthome.serverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.smarthome.serverapp.config" })
public class SmarthomeServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmarthomeServerAppApplication.class, args);
	}

}
