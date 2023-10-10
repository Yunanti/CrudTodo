package com.mutipolar.bootcamp.crud.repository;

import com.mutipolar.bootcamp.crud.domain.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
}
