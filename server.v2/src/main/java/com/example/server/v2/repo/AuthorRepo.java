package com.example.server.v2.repo;

import com.example.server.v2.entity.AuthorEntity;
import com.example.server.v2.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<AuthorEntity, Long> {
}
