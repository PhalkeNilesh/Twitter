package com.twitter.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="follow")
public class Followers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int follower_id;

	public Followers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Followers(int id, int follower_id) {
		super();
		this.id = id;
		this.follower_id = follower_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFollower_id() {
		return follower_id;
	}

	public void setFollower_id(int follower_id) {
		this.follower_id = follower_id;
	}

	@Override
	public String toString() {
		return "Followers [id=" + id + ", follower_id=" + follower_id + "]";
	}

	
	
	
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
//	private User user;
	
	
	
	
	
}
