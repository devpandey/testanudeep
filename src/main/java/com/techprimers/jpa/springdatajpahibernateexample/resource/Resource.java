package com.techprimers.jpa.springdatajpahibernateexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/all")
public class Resource {

    private UserRepository usersRepository;

    public Resource(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/")
    public List<Users> all() {
        return usersRepository.findAll();
    }

}
