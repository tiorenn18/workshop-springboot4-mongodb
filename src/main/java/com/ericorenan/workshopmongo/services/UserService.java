package com.ericorenan.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericorenan.workshopmongo.domain.User;
import com.ericorenan.workshopmongo.repository.UserRepository;
import com.ericorenan.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public Optional<User> findById(String id){
        Optional<User> user = repo.findById(id);
        if (user.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }
}
