package com.moj.model.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.moj.model.Position;

@Projection(name = "countOfficer", types = Position.class)
public interface CountOfficer {

	public Integer getId();
	
	public String getIcon();
	
	@Value("#{target.title}")
	public String getTitle();
	
	//@Value("#{@officerRepository.getTotalOfficers()}")
	//Integer getTotalOfficers();
	
	@Value("#{@officerRepository.getTotalOfficersByPosition(target)}")
	Integer getTotalOfficers(); 
	
}
