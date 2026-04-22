package com.ericorenan.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericorenan.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        
        User maria = new User("12", "Maria brown", "Maria@gmail.com");
        User alex = new User("13", "Alex green", "AlexGreen@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria,alex));

        return ResponseEntity.ok().body(list);
    }
}
