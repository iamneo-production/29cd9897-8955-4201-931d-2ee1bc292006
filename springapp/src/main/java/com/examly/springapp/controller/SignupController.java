package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import com.examly.springapp.model.UserModel;
import com.examly.springapp.service.SignupService;

@RestController
public class SignupController {

    @Autowired
    private SignupService service;

    @RequestMapping("/admin")
    public Iterable<UserModel> findAllUsers() {
        return service.findAllUsers();
    }

    @RequestMapping(method=RequestMethod.POST, value="/signup")
    public Boolean saveUser(@RequestBody UserModel user) {
        UserModel savedUser = service.saveUser(user);
        return (savedUser != null);

    }

    /*
    @GetMapping(value="/admin") 
    public ResponseEnti ty<Iterable<UserModel>> findAll() {
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
