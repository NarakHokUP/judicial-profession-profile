package com.moj.model.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.moj.model.Position;

@Projection(name = "countAllOfficers", types = Position.class)
public interface CountAllOfficers {
	
	public Integer getId();
	
	@Value("#{target.title}") //virtual projection -> optional
	public String getTitle();
	
	@Value("#{@officerRepository.getTotalOfficersByPosition(target)}")
	Integer getTotalOfficersByPosition(); 
	
	@Value("#{@officerRepository.getTotalOfficers()}")
	Integer getTotalOfficers(); 
}
