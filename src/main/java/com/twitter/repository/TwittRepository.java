package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitter.entity.Twitt;

public interface TwittRepository extends JpaRepository<Twitt, Integer> {

}
