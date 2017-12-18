package com.moj.repository;

import org.springframework.data.repository.CrudRepository;

import com.moj.model.Position;

//@RepositoryRestResource(excerptProjection = CountOfficer.class)
public interface PositionRepository extends CrudRepository<Position, Integer>{
	
	
}
