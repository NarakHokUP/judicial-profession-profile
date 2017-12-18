package com.moj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.moj.model.Officer;
import com.moj.model.Position;

@Repository
public interface OfficerRepository extends JpaRepository<Officer, Integer>{
	
	@RestResource(path="en-name", rel="en-name")
	public List<Officer> findByEnNameContainsIgnoreCase(@Param("enName") String enName);
	
	@RestResource(path="kh-name", rel="kh-name")
	public List<Officer> findByKhNameContainsIgnoreCase(@Param("khName") String khName);
	
	@RestResource(path="name", rel="name")
	@Query("select o from Officer o where lower(o.enName) LIKE lower(concat('%', :name, '%')) or o.khName LIKE concat('%', :name, '%')")
	public List<Officer> findByName(@Param("name") String name);
	
	@RestResource(exported = false)
	@Query("select count(o) from Officer o")
	public Integer getTotalOfficers();
	
	@RestResource(exported = false)
	@Query("select count(o) from Officer o where o.position = ?1")
	public Integer getTotalOfficersByPosition(Position position);
	
}
