package com.moj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.moj.model.Officer;

@Repository
public interface OfficerRepository extends JpaRepository<Officer, Integer>{
	
	@RestResource(path="en-name", rel="en-name")
	public List<Officer> findByEnNameContainsIgnoreCase(@Param("enName") String enName);
	@RestResource(path="kh-name", rel="kh-name")
	public List<Officer> findByKhNameContainsIgnoreCase(@Param("khName") String khName);
}
