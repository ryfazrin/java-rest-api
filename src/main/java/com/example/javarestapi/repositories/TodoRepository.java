package com.example.javarestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.javarestapi.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
