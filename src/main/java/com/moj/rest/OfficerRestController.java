package com.moj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moj.model.Officer;
import com.moj.model.Position;
import com.moj.repository.OfficerRepository;

@RepositoryRestController
@ResponseBody
public class OfficerRestController {

	@Autowired
	private OfficerRepository officerRepository;
	
	//if no officer id, add. else update
	@PostMapping("/positions/{id}/officers")
	public ResponseEntity<?> saveOfficer(@RequestBody Officer officer, @PathVariable Integer id, Position position){
		position.setId(id);
		officer.setPosition(position);
		officerRepository.save(officer);		
		return new ResponseEntity<Officer>(HttpStatus.CREATED);
	}
}
