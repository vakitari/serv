package com.example.server.v2.repo;

import com.example.server.v2.entity.BookEntity;
import com.example.server.v2.entity.PublisherEntity;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<PublisherEntity, Long> {
}
