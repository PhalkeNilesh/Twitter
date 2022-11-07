package com.twitter.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.entity.Followers;
import com.twitter.entity.Twitt;
import com.twitter.entity.User;
import com.twitter.repository.TwittRepository;
import com.twitter.repository.UsersRepository;
import com.twitter.serviceImpl.TweetServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UsersRepository userRepo;
	
	@Autowired
	private TwittRepository tRepo;
	
	//@Autowired
	//private FollowerRepository fRepo;
	
	@RequestMapping("/")
	public String home() {
		return "This is home page";
	}
	
	
	
	@GetMapping("/getUser")
	public List<User> getAll() {
		List<User> user = userRepo.findAll();
		System.out.println(user);
		//List<User> user = new ArrayList<>();
		return user;
	}
	
	@PostMapping("/addUser")
	public User saveUser(@Validated @RequestBody User user) {
		return userRepo.save(user);
	}
	
	
	@PostMapping("/follow/{id}")
	public User followProcess(@RequestBody User user,@RequestParam int id) {
		int f_id= id;
		Map<String,User> u = new HashMap<>();
		
		//Optional<User> u =userRepo.findById(id);
		
		Followers follow =new Followers();
		List<Followers> f =new ArrayList<>();
		user.setFollowers(f);
		return user;
	}
	
	
	
	

}
