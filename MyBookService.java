package com.cisco.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.demo.entity.MyBook;
import com.cisco.demo.repository.MyBookRepository;

@Service
public class MyBookService 
{
	@Autowired
	private MyBookRepository repo;
	
	//method to save value
	public MyBook addBook(MyBook book) 
	{
		return repo.save(book);
	}
	

	//method to get Data
	public List<MyBook> getAllBooks()
	{
		return repo.findAll();
	}
	
	//method to get books by id
	public MyBook getBookById(String id) 
	{
		
		if(repo.findById(id).isPresent()) 
		{
			return repo.findById(id).get();
		}else {
			return null;
		}
		
	}
	
	//delete the book by id
	public boolean deleteBookById(String id)
	{
		if(repo.findById(id).isPresent())
		{
	        repo.deleteById(id);
	        return true;
			
		}
		else
		{
			return false;
		}
	}
	
	//update the book by id
	public MyBook updateUser(MyBook book,String id) 
	{
		if(repo.findById(id).isPresent()) 
		{
			MyBook old=repo.findById(id).get();
			old.setTitle(book.getTitle());
			old.setAuthor(book.getAuthor());
			old.setYear(book.getYear());
			return repo.save(old);
		}else 
		{
			return null;
		}
	}
}
