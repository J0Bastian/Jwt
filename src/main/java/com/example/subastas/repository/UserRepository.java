package com.example.subastas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.subastas.model.User;

public interface UserRepository extends MongoRepository<User, String> {
}
