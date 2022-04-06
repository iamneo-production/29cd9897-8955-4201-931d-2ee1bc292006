package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.examly.springapp.model.ResourceModel;
import com.examly.springapp.service.ResourceService;

@RestController
public class ResourceController {

    @Autowired
    private ResourceService service;

    @RequestMapping("/home")
    public Iterable<ResourceModel> getResource() {
        return service.getResource();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/home/{id}")
    public void resourceEditSave(@RequestBody ResourceModel data, @PathVariable String id) {
        service.resourceEditSave(data);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/admin/resource/{id}")
    public void resourceEditSave(@PathVariable @RequestBody ResourceModel data) {
        service.resourceEditSave(data);
    }

    @RequestMapping(method=RequestMethod.POST, value="/home")
    public void resourceSave(@RequestBody ResourceModel data) {
        service.resourceSave(data);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/home/{id}")
    public void resourceDelete(@PathVariable String id) {
        service.resourceDelete(id);
    }

    /*
    @GetMapping(value="/admin") 
    public ResponseEntity<Iterable<UserModel>> findAll() {
        List<UserModel> users = service.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping(value="/signup")
    public ResponseEntity<Boolean> saveUser(@RequestBody UserModel user) {
        UserModel savedUser = service.addUser(user);
        return new ResponseEntity<>((savedUser != null), HttpStatus.OK);
    }
    @PostMapping(value="/admin/verify")
    public ResponseEntity<UserModel> verifyUser(@RequestBody UserModel user) {
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    */
}
