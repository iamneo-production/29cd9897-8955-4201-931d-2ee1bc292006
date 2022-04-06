package com.examly.springapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.examly.springapp.model.ResourceModel;
import com.examly.springapp.repository.ResourceRepository;

import java.util.Optional;

@Service
public class ResourceService {
    
    @Autowired
    private ResourceRepository repository;

    public Iterable<ResourceModel> getResource() {
        return repository.findAll();
    }

    public Optional<ResourceModel> resourceById(String id) {
        return repository.findById(id);
    }

    public void resourceEditSave(ResourceModel data) {
        repository.save(data);
    }

    public void resourceSave(ResourceModel data) {
        repository.save(data);
    }

    public void resourceDelete(String id) {
        repository.deleteById(id);
    }
}