package com.example.subastas.service;

import com.example.subastas.model.AuctionTransaction;
import com.example.subastas.repository.AuctionTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionTransactionService {

    @Autowired
    private AuctionTransactionRepository auctionTransactionRepository;

    // Método para obtener todas las transacciones
    public List<AuctionTransaction> getAllTransactions() {
        return auctionTransactionRepository.findAll(); // Recupera todas las transacciones
    }

    // Método para obtener transacciones por `auctionItemId`
    public List<AuctionTransaction> getTransactionsByAuctionItemId(String auctionItemId) {
        return auctionTransactionRepository.findAllByAuctionItemId(auctionItemId); // Recupera las transacciones por ID de subasta
    }
}
