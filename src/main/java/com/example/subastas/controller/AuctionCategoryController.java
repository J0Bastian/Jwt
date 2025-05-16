package com.example.subastas.controller;

import com.example.subastas.model.AuctionCategory;
import com.example.subastas.service.AuctionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auction_category")  // Ruta de la API para las categorías de subasta
public class AuctionCategoryController {

    private final AuctionCategoryService auctionCategoryService;

    // Constructor con inyección de dependencias
    @Autowired
    public AuctionCategoryController(AuctionCategoryService auctionCategoryService) {
        this.auctionCategoryService = auctionCategoryService;
    }

    // Endpoint para obtener todas las categorías de subasta
    @GetMapping
    public List<AuctionCategory> getAllCategories() {
        return auctionCategoryService.getAllCategories();  // Devuelve todas las categorías
    }

    // Endpoint para obtener una categoría específica por ID
    @GetMapping("/{id}")
    public AuctionCategory getCategoryById(@PathVariable String id) {
        return auctionCategoryService.getCategoryById(id);  // Devuelve la categoría por su ID
    }
}
