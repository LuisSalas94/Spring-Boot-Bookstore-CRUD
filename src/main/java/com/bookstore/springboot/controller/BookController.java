package com.bookstore.springboot.controller;
import com.bookstore.springboot.entity.Book;
import com.bookstore.springboot.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/books")
public class BookController {

    @Autowired
    private BookService bookService;
    @PostMapping
    // http://localhost:8080/api/books
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
      Book savedBook = bookService.createBook(book);
      return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }
}
