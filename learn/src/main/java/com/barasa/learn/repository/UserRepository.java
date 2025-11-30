package com.barasa.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.barasa.learn.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
