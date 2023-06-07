package com.bookstore.springboot.service.implementation;
import com.bookstore.springboot.entity.Book;
import com.bookstore.springboot.repository.BookRepository;
import com.bookstore.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookImplementation implements BookService {
    @Autowired
    private BookRepository bookRepository;

    // Create a book
    @Override
    public Book createBook(Book book) {
      return bookRepository.save(book);
    }
}
