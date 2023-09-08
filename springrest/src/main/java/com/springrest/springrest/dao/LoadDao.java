package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Loads;

public interface LoadDao extends JpaRepository<Loads,Long> {
	
}
