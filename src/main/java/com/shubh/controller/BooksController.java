package com.shubh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.shubh.entity.Books;
import com.shubh.service.BookServices;

@RestController
public class BooksController 
{
	@Autowired
	private BookServices bookService;
	
	@PostMapping("/save")
	public Books saveBook(@RequestBody Books book)
	{
		Books bb = bookService.saveBook(book);
		
		return bb;
		
	}
	
	@GetMapping("/get/{id}")
	public Books getBookById(@PathVariable Integer id)
	{
		Books bbb = bookService.getBookById(id);
		return bbb;
	}
	
	@GetMapping("/getAll")
	public List<Books> getAllBooks()
	{
		List<Books> bbbb = bookService.getAllBooks();
		return bbbb;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable Integer id)
	{
		bookService.deleteBook(id);	
	}
	
	@PutMapping("/update/{id}")
	public Books updateBooks(@RequestBody Books book,@PathVariable Integer id)
	{
		Books bbbbb = bookService.updateBooks(book, id);
		return bbbbb;
	}
}
