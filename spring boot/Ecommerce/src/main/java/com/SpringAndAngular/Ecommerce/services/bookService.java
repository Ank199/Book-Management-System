package com.SpringAndAngular.Ecommerce.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringAndAngular.Ecommerce.modal.Book;


@Service
public interface bookService {
  public List<Book> getAllBook();
public String AddBook(Book book);
public String deleteBooks(Integer Id);
// public Book updateBooks(Book book);
public Book updateBookById(Integer id,Book updatedBook);
public Book getBookById(Integer id);




} 
