package com.example.server.v2.servise;

import com.example.server.v2.entity.AuthorEntity;
import com.example.server.v2.repo.AuthorRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthorServise {
    private final AuthorRepo repo;
    public AuthorServise(AuthorRepo repo) {
        this.repo = repo;
    }
    public void save(AuthorEntity book) {repo.save(book);}
    public void delete(Long id){repo.deleteById(id);}
    public Iterable<AuthorEntity> getAll(){return repo.findAll();}
}
