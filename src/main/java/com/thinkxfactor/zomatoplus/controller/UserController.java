package com.thinkxfactor.zomatoplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.model.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/login")
	public User userLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
		return userRepository.findByNameAndPassword(username,password);
	}

	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}

}
