package com.shubh.service;

import java.util.List;

import com.shubh.entity.Books;

public interface BookServices 
{
	public Books saveBook(Books book);
	public Books getBookById(Integer id);
	public List<Books> getAllBooks();
	public void deleteBook(Integer id);
	public Books updateBooks(Books book,Integer id);
	
}
