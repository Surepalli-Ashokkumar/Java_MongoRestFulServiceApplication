package com.cisco.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cisco.demo.entity.MyBook;

@Repository
public interface MyBookRepository extends MongoRepository<MyBook, String>
{
      //queries we can write if needed
}

