package com.twitter.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.twitter.entity.Twitt;
import com.twitter.service.TwittService;

public class TweetServiceImpl implements TwittService{

	@Override
	public Twitt getTweetById(Long tweetId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Twitt> getFollowersTweets(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Twitt createNewTweet(Twitt tweet) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Page<Tweet> getTweets(Pageable pageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Tweet getTweetById(Long tweetId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Tweet createNewTweet(Tweet tweet) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
