package com.cisco.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cisco.demo.entity.MyBook;
import com.cisco.demo.repository.MyBookRepository;
import com.cisco.demo.service.MyBookService;

@RestController
@RequestMapping("/api/books")
public class MyBookController 
{
	@Autowired
	private MyBookService service;
	
	@PostMapping("/add")
	public MyBook addBook(@RequestBody MyBook book) {
		return service.addBook(book);
	}
}
