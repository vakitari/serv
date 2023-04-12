package com.example.server.v2.repo;

import com.example.server.v2.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<BookEntity, Long> {
    Iterable<BookEntity> findByPublishing_publisher(String publisher);
}
