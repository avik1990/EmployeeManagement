package com.bookstore.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bkRepo;
	
	public void saveBook(Book b) {
		bkRepo.save(b);
	}
	
	public List<Book> getAllBooks() {
		return bkRepo.findAll();
	}
	
	public Book getBookById(int id) {
		return bkRepo.findById(id).get();
	}
}
