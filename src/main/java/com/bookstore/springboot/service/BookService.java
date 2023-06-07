package com.bookstore.springboot.service;

import com.bookstore.springboot.entity.Book;

public interface BookService {
    Book createBook(Book book);
    Book getBookById(Long bookId);
}
