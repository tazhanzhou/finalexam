package com.johnabbott.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.model.UserEntity;
import com.johnabbott.service.UserService;

@Controller
@RequestMapping("/User")
public class UserContoller {
	@Autowired
	UserService userService;

	@RequestMapping("/test")
	public String test() {
		return "Home";
	}
	
	@RequestMapping("/Login")
	public String login(UserEntity user) {
		List<UserEntity> userList=userService.login(user);
		if (userList.size() > 0) {
            return "Home";
        } else {
            return "Register";
        }
	}
	
	@RequestMapping(value = "Register")
	public ModelAndView addUser() {
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("user", new UserEntity());
		return mv;
	}
	
}
	
//	@RequestMapping(value = "/user/{email}", method = RequestMethod.GET)
//	public String getUser(@PathVariable("email") String email) {
//		
//		return "Home";
//	}