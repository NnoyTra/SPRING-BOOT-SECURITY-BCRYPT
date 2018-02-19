package com.lito.code.service;

import com.lito.code.users.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}