package com.johnabbott.dao;

import java.util.List;

import com.johnabbott.model.UserEntity;

public interface UserDao {
	
	public int insertUser(UserEntity user);

//	public UserEntity check(String email, String password);
	
	public List<UserEntity> search(UserEntity user);

}
