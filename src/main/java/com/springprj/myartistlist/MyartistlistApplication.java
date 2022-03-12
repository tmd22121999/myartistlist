package com.springprj.myartistlist;

import com.springprj.myartistlist.repositories.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyartistlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyartistlistApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository) {
		return arg -> {
			// user user = new user(2, "userName", "passwd");
			repository.findAll().forEach(item -> System.out.println(item.getID()));
		};
	}
}
