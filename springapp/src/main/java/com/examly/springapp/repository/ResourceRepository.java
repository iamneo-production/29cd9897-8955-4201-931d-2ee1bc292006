package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.ResourceModel;

@Repository
public interface ResourceRepository extends CrudRepository<ResourceModel, String> {}
