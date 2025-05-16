package com.example.subastas.service;

import com.example.subastas.model.AuctionWatchlist;
import com.example.subastas.repository.AuctionWatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionWatchlistService {

    @Autowired
    private AuctionWatchlistRepository auctionWatchlistRepository;

    // Método para obtener todas las subastas vigiladas de un usuario
    public List<AuctionWatchlist> getWatchlistByUserId(String userId) {
        return auctionWatchlistRepository.findAllByUserId(userId);
    }

    // Método para obtener todas las subastas vigiladas
    public List<AuctionWatchlist> getAllWatchlists() {
        return auctionWatchlistRepository.findAll();
    }
}
