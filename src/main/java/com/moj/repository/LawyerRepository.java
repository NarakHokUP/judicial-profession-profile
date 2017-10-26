package com.moj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moj.model.Lawyer;

@Repository
public interface LawyerRepository extends JpaRepository<Lawyer, Integer>{

	
	
	
	
}
