package com.example.subastas.repository;

import com.example.subastas.model.AuctionTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface AuctionTransactionRepository extends MongoRepository<AuctionTransaction, String> {
    List<AuctionTransaction> findAllByAuctionItemId(String auctionItemId);
}