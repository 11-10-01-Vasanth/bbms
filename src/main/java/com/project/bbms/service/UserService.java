package com.project.bbms.service;

import java.util.List;

import com.project.bbms.model.User;

public interface UserService {
	User createUser(User user);

	User getUser(Long id);

	List<User> getAllUsers();

	String removeUser(Long id);
}
