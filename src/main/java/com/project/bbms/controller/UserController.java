package com.project.bbms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bbms.exceptions.UserNotException;
import com.project.bbms.model.User;
import com.project.bbms.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User savedUser = userService.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> getUser(@PathVariable Long id) {
		User user = userService.getUser(id);
		if (user == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
		}
		return ResponseEntity.ok(user);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<User>> getAllUsers() {
		return ResponseEntity.ok(userService.getAllUsers());
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeUser(@PathVariable Long id) {
		String message = userService.removeUser(id);
		if (message.equals("User Not Found")) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		}
		return ResponseEntity.ok(message);
	}
}
