package com.bookstore.springboot.controller;
import com.bookstore.springboot.entity.Book;
import com.bookstore.springboot.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("{id}")
    // http://localhost:8080/api/books/1
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long bookId) {
      Book book =  bookService.getBookById(bookId);
      return new ResponseEntity<>(book, HttpStatus.OK);
    }
    @GetMapping
    // http://localhost:8080/api/books
    public ResponseEntity<List<Book>>getAllBooks() {
      List<Book> bookList = bookService.getAllBooks();
      return new ResponseEntity<>(bookList, HttpStatus.OK);
    }
    @PutMapping("{id}")
    // http://localhost:8080/api/books/1
    public ResponseEntity<Book> updateBook(@PathVariable("id") Long bookId,@RequestBody Book book) {
          book.setId(bookId);
          Book updatedBook =  bookService.updateBook(book);
          return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    // http://localhost:8080/api/books/1
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book was deleted successfully", HttpStatus.OK);
    }

}
