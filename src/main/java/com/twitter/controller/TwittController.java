package com.twitter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.entity.Twitt;
import com.twitter.entity.User;
import com.twitter.repository.TwittRepository;

@RestController
//@RequestMapping("/twitt")
public class TwittController {
	
	@Autowired 
	private TwittRepository tRepo;
	
	@RequestMapping("/text")
	public String testMsg() {
		return "This is twitter test";
	}
	
	@PostMapping("/addTwitt")
	public Twitt saveTwitt(@RequestBody Twitt twitt) {
		Twitt t= new Twitt();
		return tRepo.save(twitt);
	}
	
	@GetMapping("/getTweet/{id}")
	public List<Twitt> getTweetById(@RequestParam int id) {
		//List<Twitt> u = tRepo.findAllById(id);
		//List<Twitt> tt= tRepo.findById(id);
		List<Twitt> t = tRepo.findAll();
		//Optional<Twitt> t = tRepo.findById(id);
		//@RequestBody Twitt twitt,@RequestParam int id
		
		return t;
		
	}

}
