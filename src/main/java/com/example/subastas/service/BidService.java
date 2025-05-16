package com.example.subastas.service;

import com.example.subastas.model.Bid;
import com.example.subastas.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@Service
public class BidService {

    // Crear una instancia del Logger
    private static final Logger logger = LoggerFactory.getLogger(BidService.class);

    @Autowired
    private BidRepository bidRepository;

    // Método para obtener todas las ofertas de una subasta por el ID de la subasta
    public List<Bid> getBidsByAuctionId(String auctionId) {
        List<Bid> bids = bidRepository.findByAuctionItemId(auctionId);
        
        // Verificar si no se encontraron ofertas y registrar con logger
        if (bids.isEmpty()) {
            logger.info("No bids found for auction: {}", auctionId); // Reemplazamos System.out por logger
        }

        return bids;
    }

    // Método para obtener todas las ofertas
    public List<Bid> getAllBids() {
        List<Bid> bids = bidRepository.findAll();
        if (bids.isEmpty()) {
            logger.info("No bids available in the system.");  // Log para cuando no haya ofertas
        }
        return bids;
    }
}
