package com.twitter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.entity.Followers;
import com.twitter.entity.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
	
	//int follow(int follower_id);
	//int unfollow(int follower_id);
	//List<User> listAllUsers();
	//List<Followers> listAllFollowers();
	//List<Followers> listAllFollowing();
	//List<Followers> listUsersWithMostPopularFollower();
	

}
