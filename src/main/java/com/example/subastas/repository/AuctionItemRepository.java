package com.example.subastas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.subastas.model.AuctionItem;

public interface AuctionItemRepository extends MongoRepository<AuctionItem, String> {
    // Métodos adicionales si es necesario, por ejemplo, buscar por título, por vendedor, etc.
}