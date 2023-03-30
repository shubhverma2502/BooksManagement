package com.shubh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubh.entity.Books;
@Repository
public interface BooksRepo extends JpaRepository<Books,Integer>
{

}
