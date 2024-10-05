package com.example.BasicSpringBootProjectUsingDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicSpringBootProjectUsingDiApplication implements CommandLineRunner {

	@Autowired
	DB db;


	public static void main(String[] args) {
		SpringApplication.run(BasicSpringBootProjectUsingDiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(db.data());

	}
}
