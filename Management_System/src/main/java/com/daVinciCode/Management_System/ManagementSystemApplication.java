package com.daVinciCode.Management_System;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
@RestController
public class ManagementSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(ManagementSystemApplication.class, args);
	}

	@GetMapping(path = "/hello", produces = MediaType.IMAGE_GIF_VALUE)
	public ResponseEntity<Resource> hello() throws Exception {
		// Set your file's path here
		Path filePath = Paths.get("C:/Users/Dave/Documents/Personal Projects/Research/Management_System/Management_System/media/sob-arnold.gif");
		Resource resource = new UrlResource(filePath.toUri());
		return ResponseEntity.ok()
				.contentType(MediaType.IMAGE_GIF)
				.header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}
}