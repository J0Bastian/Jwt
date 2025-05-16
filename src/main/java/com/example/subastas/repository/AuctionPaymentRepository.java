package com.example.subastas.repository;

import com.example.subastas.model.AuctionPayment;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface AuctionPaymentRepository extends MongoRepository<AuctionPayment, String> {
    // Método para obtener los pagos por `auctionTransactionId`
    List<AuctionPayment> findAllByAuctionTransactionId(String auctionTransactionId);
}
