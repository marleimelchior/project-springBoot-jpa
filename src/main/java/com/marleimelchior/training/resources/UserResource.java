package com.marleimelchior.training.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marleimelchior.training.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "marlei da silva melchior", "marleimelchior@gmail.com", "61986593994", "123456");
		return ResponseEntity.ok().body(u);
	}
}
