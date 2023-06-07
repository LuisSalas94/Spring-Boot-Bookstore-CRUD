package com.bookstore.springboot.repository;
import com.bookstore.springboot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, Long> {
}
