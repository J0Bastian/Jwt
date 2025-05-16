package com.example.subastas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.subastas.model.AuctionCategory;

public interface AuctionCategoryRepository extends MongoRepository<AuctionCategory, String> {
    // Métodos adicionales si es necesario, por ejemplo, buscar por nombre, descripción, etc.
}
