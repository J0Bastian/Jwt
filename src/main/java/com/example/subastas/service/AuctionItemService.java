package com.example.subastas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.subastas.model.AuctionItem;
import com.example.subastas.repository.AuctionItemRepository;
import java.util.List;

@Service
public class AuctionItemService {

    @Autowired
    private AuctionItemRepository auctionItemRepository;

    // Obtener todos los artículos de subasta
    public List<AuctionItem> getAllAuctionItems() {
        return auctionItemRepository.findAll();
    }

    // Obtener artículo de subasta por ID
    public AuctionItem getAuctionItemById(String id) {
        return auctionItemRepository.findById(id).orElse(null);
    }
}
