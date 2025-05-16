package com.example.subastas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.subastas.model.AuctionCategory;
import com.example.subastas.repository.AuctionCategoryRepository;
import java.util.List;

@Service
public class AuctionCategoryService {

    @Autowired
    private AuctionCategoryRepository auctionCategoryRepository;

    // Obtener todas las categorías de subasta
    public List<AuctionCategory> getAllCategories() {
        return auctionCategoryRepository.findAll();
    }

    // Obtener una categoría por su ID
    public AuctionCategory getCategoryById(String id) {
        return auctionCategoryRepository.findById(id).orElse(null);  // Si no se encuentra, devuelve null
    }
}
