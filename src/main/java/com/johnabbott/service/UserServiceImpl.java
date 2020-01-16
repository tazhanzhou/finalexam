package com.johnabbott.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.johnabbott.dao.UserDao;
import com.johnabbott.model.UserEntity;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	@Override
	public boolean addUser(UserEntity user) {
		return userDao.insertUser(user) > 0;
	}
//
//	@Override
//	public UserEntity getUserByEmail(String email) {
//		return userDao.getUserByEmail(email);
//	}

	@Override
	public List<UserEntity> login(UserEntity user) {
		return userDao.search(user);
	}

}
