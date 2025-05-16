package com.example.subastas.controller;

import com.example.subastas.model.Bid;
import com.example.subastas.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bid") // Controlador para todas las rutas relacionadas con las ofertas
public class BidController {

    @Autowired
    private BidService bidService;

    // Endpoint para obtener todas las ofertas de una subasta específica (GET)
    @GetMapping("/auction/{auctionItemId}")
    public List<Bid> getBidsByAuctionId(@PathVariable String auctionItemId) {
        return bidService.getBidsByAuctionId(auctionItemId); // Devuelve las ofertas de la subasta
    }

    // Endpoint para obtener todas las ofertas
    @GetMapping
    public List<Bid> getAllBids() {
        return bidService.getAllBids(); // Devuelve todas las ofertas
    }
}
