package com.rehkalainin.bookStore.repository;

import com.rehkalainin.bookStore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
  User findByUsername(String username);
}