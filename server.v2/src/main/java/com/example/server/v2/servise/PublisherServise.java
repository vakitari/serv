package com.example.server.v2.servise;


import com.example.server.v2.entity.PublisherEntity;
import com.example.server.v2.repo.PublisherRepo;
import org.springframework.stereotype.Service;

@Service
public class PublisherServise {
    private final PublisherRepo repo;
    public PublisherServise(PublisherRepo repo) {
        this.repo = repo;
    }
    public void save(PublisherEntity book) {repo.save(book);}
    public void delete(Long id){repo.deleteById(id);}
    public Iterable<PublisherEntity> getAll(){return repo.findAll();}
}
