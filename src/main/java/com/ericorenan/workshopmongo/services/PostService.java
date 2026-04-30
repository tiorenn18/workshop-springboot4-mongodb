package com.ericorenan.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericorenan.workshopmongo.domain.Post;
import com.ericorenan.workshopmongo.repository.PostRepository;
import com.ericorenan.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
    
    @Autowired
    private PostRepository repository;

    public List<Post> findAll(){
        return repository.findAll();
    }

    public Optional<Post> findById(String id) {
        Optional<Post> post = repository.findById(id);
        if (post.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }

        return post;
    }
}
