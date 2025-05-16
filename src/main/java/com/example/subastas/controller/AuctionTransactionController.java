package com.example.subastas.controller;

import com.example.subastas.model.AuctionTransaction;
import com.example.subastas.service.AuctionTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auction_transaction") // Controlador para las rutas relacionadas con las transacciones de subasta
public class AuctionTransactionController {

    private final AuctionTransactionService auctionTransactionService;

    // Inyección de dependencias mediante constructor
    @Autowired
    public AuctionTransactionController(AuctionTransactionService auctionTransactionService) {
        this.auctionTransactionService = auctionTransactionService;
    }

    // Endpoint para obtener todas las transacciones (GET)
    @GetMapping
    public List<AuctionTransaction> getAllTransactions() {
        return auctionTransactionService.getAllTransactions(); // Devuelve todas las transacciones
    }

    // Endpoint para obtener las transacciones de un artículo de subasta específico (GET)
    @GetMapping("/auction/{auctionItemId}")
    public List<AuctionTransaction> getTransactionsByAuctionItemId(@PathVariable String auctionItemId) {
        return auctionTransactionService.getTransactionsByAuctionItemId(auctionItemId); // Devuelve las transacciones de la subasta
    }
}
