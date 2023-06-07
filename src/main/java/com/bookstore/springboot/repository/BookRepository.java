package com.bookstore.springboot.repository;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<User, Long> {
}
