package com.bookstore.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.entity.MyBookList;
import com.bookstore.bookstore.repository.MyBooksRepo;

@Service
public class MyBookService {

	
	@Autowired
	private MyBooksRepo mybkRepo;
	
	public void saveMyBook(MyBookList b) {
		mybkRepo.save(b);
	}
	
	public List<MyBookList> getAllMyBooks() {
		return mybkRepo.findAll();
	}
	
	public void deleteByID(int id) {
		mybkRepo.deleteById(id);
	}
}
