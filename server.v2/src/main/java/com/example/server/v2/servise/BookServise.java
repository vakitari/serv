package com.example.server.v2.servise;

import com.example.server.v2.entity.BookEntity;
import com.example.server.v2.repo.BookRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServise {
    private final BookRepo repo;
    public BookServise(BookRepo repo) {
        this.repo = repo;
    }
    public void save(BookEntity book) {repo.save(book);}
    public void delete(Long id){repo.deleteById(id);}
    public Iterable<BookEntity> getAll(){return repo.findAll();}
    public Iterable<BookEntity> getPublisher(String publisher){
        return repo.findByPublishing_publisher(publisher);
    }
}
