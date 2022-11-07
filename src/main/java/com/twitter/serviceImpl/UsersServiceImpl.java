package com.twitter.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.twitter.entity.Followers;
import com.twitter.entity.User;
import com.twitter.service.UsersService;

public class UsersServiceImpl implements UsersService{

	@Override
	public int follow(int follower_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Followers> listAllFollowers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> getFollowers(Long userId, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> getFollowing(Long userId, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> processFollow(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
