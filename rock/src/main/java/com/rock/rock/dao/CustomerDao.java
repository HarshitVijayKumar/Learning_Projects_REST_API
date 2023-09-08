package com.rock.rock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rock.rock.entities.*;

public interface CustomerDao extends JpaRepository<Customer,Long> {
	
}
