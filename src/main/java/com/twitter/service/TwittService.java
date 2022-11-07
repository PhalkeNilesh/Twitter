package com.twitter.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.twitter.entity.Twitt;

@Service
public interface TwittService {
	
	Twitt getTweetById(Long tweetId);
	
	Page<Twitt> getFollowersTweets(Pageable pageable);

	//TweetProjection createNewTweet(Tweet tweet);
	Twitt createNewTweet(Twitt tweet);
	
	/* 
	 * 
	 * Page<Tweet> getTweets(Pageable pageable);
	
	Tweet getTweetById(Long tweetId);
	
	Tweet createNewTweet(Tweet tweet);
	 * */
}
