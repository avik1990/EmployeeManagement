package com.bookstore.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.entity.MyBookList;
import com.bookstore.bookstore.repository.BookRepository;
import com.bookstore.bookstore.service.BookService;
import com.bookstore.bookstore.service.MyBookService;

@Controller
public class MyBookListController {
	
	
	@Autowired
	private MyBookService mybkservice;
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteMyBooks(@PathVariable("id") int id) {
		mybkservice.deleteByID(id);
		return "redirect:/my_Books";
	}
	

}
