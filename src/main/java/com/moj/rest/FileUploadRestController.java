package com.moj.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.phearun.fileupload.service.PRFileUploadService;

@RepositoryRestController
public class FileUploadRestController {

	@Autowired
	private PRFileUploadService fileUploadService;

	@ResponseBody
	@PostMapping(value = "/pr/uploads")
	public List<String> upload(List<MultipartFile> files, @RequestParam(value="folder", required=false, defaultValue = "") String folder) {
		return fileUploadService.upload(files, folder);
	}
	
}
