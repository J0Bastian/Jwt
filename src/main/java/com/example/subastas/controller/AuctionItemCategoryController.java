package com.example.subastas.controller;

import com.example.subastas.model.AuctionItemCategory;
import com.example.subastas.service.AuctionItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auction_item_category") // Controlador para las rutas relacionadas con las categorías de los artículos de subasta
public class AuctionItemCategoryController {

    private final AuctionItemCategoryService auctionItemCategoryService;

    // Inyección de dependencias mediante el constructor
    @Autowired
    public AuctionItemCategoryController(AuctionItemCategoryService auctionItemCategoryService) {
        this.auctionItemCategoryService = auctionItemCategoryService;
    }

    // Endpoint para obtener todas las categorías de artículos de subasta (GET)
    @GetMapping
    public List<AuctionItemCategory> getAllCategories() {
        return auctionItemCategoryService.getAllCategories(); // Devuelve todas las categorías
    }

    // Endpoint para obtener las categorías de un artículo de subasta específico (GET)
    @GetMapping("/auction/{auctionItemId}")
    public List<AuctionItemCategory> getCategoriesByAuctionItemId(@PathVariable String auctionItemId) {
        return auctionItemCategoryService.getCategoriesByAuctionItemId(auctionItemId); // Devuelve las categorías de un artículo específico
    }
}
