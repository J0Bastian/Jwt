package com.example.subastas.repository;

import com.example.subastas.model.AuctionItemCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface AuctionItemCategoryRepository extends MongoRepository<AuctionItemCategory, String> {
    // Método para obtener categorías de un artículo de subasta específico por su `auctionItemId`
    List<AuctionItemCategory> findAllByAuctionItemId(String auctionItemId);
}