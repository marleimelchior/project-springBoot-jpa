package com.marleimelchior.training.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marleimelchior.training.entities.Order;
import com.marleimelchior.training.entities.User;
import com.marleimelchior.training.repositories.OrderRepository;
import com.marleimelchior.training.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "marlei da silva", "marlei@gmail.com", "986593994", "123456");
		User u2 = new User(null, "fernanda francisca", "fernanda@gmail.com", "957893664","1234567");
		
		Order o1 = new Order(null, Instant.parse("2023-01-22T14:52:20Z"), u1);
		Order o2 = new Order(null, Instant.parse("2023-02-23T14:52:20Z"), u2);
		Order o3 = new Order(null, Instant.parse("2023-03-24T14:52:20Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
