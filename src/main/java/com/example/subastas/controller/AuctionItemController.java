package com.example.subastas.controller;

import com.example.subastas.model.AuctionItem;
import com.example.subastas.service.AuctionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auction_item") // Controlador para las rutas relacionadas con los artículos de subasta
public class AuctionItemController {

    private final AuctionItemService auctionItemService;

    // Inyección de dependencias mediante constructor
    @Autowired
    public AuctionItemController(AuctionItemService auctionItemService) {
        this.auctionItemService = auctionItemService;
    }

    // Endpoint para obtener todos los artículos de subasta
    @GetMapping
    public List<AuctionItem> getAllAuctionItems() {
        return auctionItemService.getAllAuctionItems(); // Devuelve todos los artículos de subasta
    }

    // Endpoint para obtener un artículo de subasta por ID
    @GetMapping("/{id}")
    public AuctionItem getAuctionItemById(@PathVariable String id) {
        return auctionItemService.getAuctionItemById(id); // Devuelve el artículo de subasta por su ID
    }
}
