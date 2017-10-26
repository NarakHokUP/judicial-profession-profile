package com.moj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.moj.model.Position;

@Repository
public interface PositionRepository extends CrudRepository<Position, Integer>{

	
}
