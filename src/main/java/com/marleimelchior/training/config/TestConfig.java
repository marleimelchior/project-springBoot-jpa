package com.marleimelchior.training.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marleimelchior.training.entities.User;
import com.marleimelchior.training.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "marlei da silva", "marlei@gmail.com", "986593994", "123456");
		User u2 = new User(null, "fernanda francisca", "fernanda@gmail.com", "957893664","1234567");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
