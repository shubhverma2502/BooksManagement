package com.shubh.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubh.entity.Books;
import com.shubh.repository.BooksRepo;
import com.shubh.service.BookServices;
@Service
public class BookServiceImpl implements BookServices 
{
	@Autowired
	private BooksRepo bookRepo;

	@Override
	public Books saveBook(Books book) {
		
		Books b1 = bookRepo.save(book);
		System.out.println(b1);
		return b1;
	}

	@Override
	public Books getBookById(Integer id) {
		
		Optional<Books> b2 = bookRepo.findById(id);
		System.out.println(b2);
		return b2.get();
	}

	@Override
	public List<Books> getAllBooks() {
		List<Books>bookList = bookRepo.findAll();
		System.out.println(bookList);
		return bookList;
	}

	@Override
	public void deleteBook(Integer id) {
		
		bookRepo.deleteById(id);
		System.out.println("Deleted successfully");
		
	}

	@Override
	public Books updateBooks(Books book,Integer id) {
		Optional<Books>optional = bookRepo.findById(id);
		Books books = optional.get();	
		books.setId(id);
		books.setBookName(book.getBookName());
		books.setAutherName(book.getAutherName());
		books.setEdition(book.getEdition());
		return bookRepo.save(books);
	}

}
