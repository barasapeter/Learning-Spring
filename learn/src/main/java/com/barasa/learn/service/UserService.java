package com.barasa.learn.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.barasa.learn.repository.UserRepository;
import com.barasa.learn.entity.User;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public User create(User user) {
        return repo.save(user);
    }

    public User getByEmail(String email) {
        return repo.findByEmail(email);
    }
}

