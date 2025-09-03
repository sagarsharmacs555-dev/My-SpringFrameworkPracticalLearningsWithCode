package com.app.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@GetMapping("/get")
	public ResponseEntity<String> getName()
	{
		return new ResponseEntity("SagarSharmaGet" ,HttpStatus.ACCEPTED );
	}
	
	@PutMapping("/put")
	public ResponseEntity<String> updateName()
	{
		return new ResponseEntity("SagarSharmaUpdated" ,HttpStatus.ACCEPTED );
	}

	@PostMapping("/post")
	public ResponseEntity<String> saveName()
	{
		return new ResponseEntity("SagarSharmaSaved" ,HttpStatus.ACCEPTED );
	}

	@DeleteMapping("delete")
	public ResponseEntity<String> deleteName()
	{
		return new ResponseEntity("SagarSharmadeleted" ,HttpStatus.ACCEPTED );
	}


}
