package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.ChatModel;

@Repository
public interface ChatRepository extends CrudRepository<ChatModel, String> {}
