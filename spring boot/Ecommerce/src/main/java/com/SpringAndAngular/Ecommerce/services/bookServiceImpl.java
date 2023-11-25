package com.SpringAndAngular.Ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringAndAngular.Ecommerce.modal.Book;

import com.SpringAndAngular.Ecommerce.repository.BookRepo;



@Service
public class bookServiceImpl implements bookService {

    @Autowired
    BookRepo service;



    @Override
    public List<Book> getAllBook() {
        return service.findAll();
    }

    @Override
    public String AddBook(Book book) {
        service.save(book);
        return "Book added successfully";
    }

    @Override
    public String deleteBooks(Integer Id) {
        service.deleteById(Id);
        return "deleted";
    }

  


    public Book updateBookById(Integer id, Book updatedBook) {
        Optional<Book> optionalBook =service.findById(id);

        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();
             existingBook.setId(updatedBook.getId());
            existingBook.setName(updatedBook.getName());
            existingBook.setPrice(updatedBook.getPrice());
       

            return service.save(existingBook);
        }
        return updatedBook; 
    }

    @Override
    public Book getBookById(Integer id) {
        return service.findById(id).orElse(null);
    }

    public String Remove(Integer id) {
        return null;
    }

   
}
