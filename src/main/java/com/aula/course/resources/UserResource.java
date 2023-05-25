package com.aula.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	public ResponseEntity<User> findAll(){
		User u = new User(1l, "rafael", "rafael@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
