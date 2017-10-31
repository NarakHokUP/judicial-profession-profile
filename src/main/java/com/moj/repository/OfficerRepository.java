package com.moj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moj.model.Officer;

@Repository
public interface OfficerRepository extends JpaRepository<Officer, Integer>{

}
