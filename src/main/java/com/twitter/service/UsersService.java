package com.twitter.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.twitter.entity.Followers;
import com.twitter.entity.User;

@Service
public interface UsersService {
	
	int follow(int follower_id);
	List<User> listAllUsers();
	List<Followers> listAllFollowers();
	
	Page<User> getFollowers(Long userId, Pageable pageable);

    Page<User> getFollowing(Long userId, Pageable pageable);

    Map<String, Object> processFollow(Long userId);

}
