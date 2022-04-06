package com.examly.springapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.examly.springapp.model.UserModel;
import com.examly.springapp.repository.UserRepository;

@Service
public class SignupService {
    
    @Autowired
    private UserRepository repository;

    public Iterable<UserModel> findAllUsers() {
        return repository.findAll();
    }

    public UserModel saveUser(UserModel user) {
        return repository.save(user);
    }    
}