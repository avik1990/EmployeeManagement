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
public class BookController {
	
	@Autowired
	private BookService bkservice;
	
	@Autowired
	private MyBookService mybkservice;
	
	@GetMapping("/")
	public String Home() {
		return "Home";
	}
	
	@GetMapping("/AddNewbook")
	public String AddNewbook() {
		return "AddNewbook";
	}
	
	@GetMapping("/available_books")
	public ModelAndView getAllBooks() {
		List<Book> list = bkservice.getAllBooks();
		return new ModelAndView("booklist","book",list);
	}
	
	@PostMapping("/save")
	public String addbook(@ModelAttribute Book b) {
		bkservice.saveBook(b);
		return "redirect:/available_books";
	}
	
	@GetMapping("/my_Books")
	public ModelAndView getMyBooks() {
		List<MyBookList> list = mybkservice.getAllMyBooks();
		return new ModelAndView("myBooks","myBooks",list);
		//return "myBooks";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyBookList(@PathVariable("id") int id) {
		Book b = bkservice.getBookById(id);
		MyBookList mb= new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
		mybkservice.saveMyBook(mb);
		return "redirect:/my_Books";
	}

}
