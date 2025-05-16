package com.example.subastas.repository;

import com.example.subastas.model.AuctionWatchlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface AuctionWatchlistRepository extends MongoRepository<AuctionWatchlist, String> {
    // Método para obtener las subastas vigiladas por un ID de usuario
    List<AuctionWatchlist> findAllByUserId(String userId);
}
