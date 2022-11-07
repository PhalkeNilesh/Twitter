package com.twitter.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column(name ="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	//@OneToMany(mappedBy = "user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@OneToMany(targetEntity = Followers.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id_fk",referencedColumnName = "user_id") 
    private List<Followers> followers = new ArrayList<>();
	
	@OneToMany
	//@JoinColumn(name = "twitt_id_fk", referencedColumnName = "user_id")
	private List<Twitt> twitt;
	
	//private int followers_id;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer user_id, String userName, String email, String password, List<Followers> followers) {
		super();
		this.user_id = user_id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.followers = followers;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Followers> getFollowers() {
		return followers;
	}

	public void setFollowers(List<Followers> followers) {
		this.followers = followers;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", followers=" + followers + "]";
	}
	
	


	
	
	
	
	
	

}
