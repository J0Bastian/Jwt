package com.example.subastas.service;

import com.example.subastas.model.AuctionItemCategory;
import com.example.subastas.repository.AuctionItemCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionItemCategoryService {

    @Autowired
    private AuctionItemCategoryRepository auctionItemCategoryRepository;

    // Método para obtener todas las categorías de artículos de subasta
    public List<AuctionItemCategory> getAllCategories() {
        return auctionItemCategoryRepository.findAll(); // Devuelve todas las categorías
    }

    // Método para obtener categorías de un artículo de subasta específico por su `auctionItemId`
    public List<AuctionItemCategory> getCategoriesByAuctionItemId(String auctionItemId) {
        return auctionItemCategoryRepository.findAllByAuctionItemId(auctionItemId); // Devuelve las categorías de un artículo específico
    }
}
