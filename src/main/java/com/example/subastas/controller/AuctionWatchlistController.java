package com.example.subastas.controller;

import com.example.subastas.model.AuctionWatchlist;
import com.example.subastas.service.AuctionWatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auction-watchlist") // Controlador para las rutas relacionadas con las subastas vigiladas
public class AuctionWatchlistController {

    @Autowired
    private AuctionWatchlistService auctionWatchlistService;

    // Endpoint para obtener las subastas vigiladas por un usuario específico (GET)
    @GetMapping("/user/{userId}")
    public List<AuctionWatchlist> getWatchlistByUserId(@PathVariable String userId) {
        return auctionWatchlistService.getWatchlistByUserId(userId); // Devuelve las subastas vigiladas del usuario
    }

    // Endpoint para obtener todas las subastas vigiladas (GET)
    @GetMapping
    public List<AuctionWatchlist> getAllWatchlists() {
        return auctionWatchlistService.getAllWatchlists(); // Devuelve todas las subastas vigiladas
    }
}
