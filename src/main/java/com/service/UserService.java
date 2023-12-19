package com.service;

import java.util.Optional;

import com.model.User;

public interface UserService {
	User registerUser(User user);

	User getUserById(Long id);

	User loginUser(String username, String password);

}
