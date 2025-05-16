package com.example.subastas.repository;

import com.example.subastas.model.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface BidRepository extends MongoRepository<Bid, String> {
    // Método para obtener las ofertas por el ID de la subasta
    List<Bid> findByAuctionItemId(String auctionItemId);
}
