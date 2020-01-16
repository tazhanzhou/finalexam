package com.johnabbott.service;

import java.util.List;

import com.johnabbott.model.UserEntity;

public interface UserService {
	public boolean addUser(UserEntity user);
//
//	public UserEntity getUserByEmail(String email);
	
	public List<UserEntity> login(UserEntity user);
}
