package com.bookstore.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.bookstore.entity.MyBookList;

public interface MyBooksRepo extends JpaRepository<MyBookList, Integer>{

	
	
}
