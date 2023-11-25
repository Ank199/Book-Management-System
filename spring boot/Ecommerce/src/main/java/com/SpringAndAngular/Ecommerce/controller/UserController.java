package com.SpringAndAngular.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.SpringAndAngular.Ecommerce.modal.Book;
import com.SpringAndAngular.Ecommerce.modal.cart;
import com.SpringAndAngular.Ecommerce.services.bookServiceImpl;
import com.SpringAndAngular.Ecommerce.services.cartServiceImpl;

import java.util.List;



@RestController
@RequestMapping("/Book")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private bookServiceImpl obj;

    @Autowired
    private cartServiceImpl objCart;

   



    @GetMapping("/getAllBooks") // Specify the endpoint URL
    public List<Book> getAllBooks() {
        return obj.getAllBook();
    }

    @PostMapping("/save")
    public String createBook(@RequestBody Book book) {
        return obj.AddBook(book);
    }

   @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") Integer Id) {
        System.out.println(Id);
        return obj.deleteBooks(Id);
    }



//     @RequestMapping("/update")
//     public Book updateBook(@RequestBody Book book){
// return obj.updateBooks(book);
//     }

   @PutMapping("/update/{id}")
    public Book updateBookById(@PathVariable Integer id, @RequestBody Book updatedBook) {
        return obj.updateBookById(id, updatedBook);
    }

     @GetMapping("/getBookById/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer id) {
        Book book = obj.getBookById(id);

        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    // cart
 @GetMapping("/getAllCart") // Specify the endpoint URL
    public List<cart> getAllCart() {
        return objCart.getAllCart();
    }

     @PostMapping("/Add")
    public String AddCart(@RequestBody cart Cart) {
        return objCart.AddToCart(Cart);
    }

     @DeleteMapping("/remove/{id}")
    public String RemoveById(@PathVariable("id") Integer Id) {
        System.out.println(Id);
        return objCart.Remove(Id);
    }
}
