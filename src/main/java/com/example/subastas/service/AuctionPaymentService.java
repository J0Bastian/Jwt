package com.example.subastas.service;

import com.example.subastas.model.AuctionPayment;
import com.example.subastas.repository.AuctionPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuctionPaymentService {

    @Autowired
    private AuctionPaymentRepository auctionPaymentRepository;

    // Obtener todos los pagos
    public List<AuctionPayment> getAllPayments() {
        return auctionPaymentRepository.findAll(); // Devuelve todos los pagos
    }

    // Obtener pagos por `auctionTransactionId`
    public List<AuctionPayment> getPaymentsByAuctionTransactionId(String auctionTransactionId) {
        return auctionPaymentRepository.findAllByAuctionTransactionId(auctionTransactionId); // Devuelve los pagos de una transacción específica
    }

    // Crear un nuevo pago
    public AuctionPayment createPayment(AuctionPayment payment) {
        return auctionPaymentRepository.save(payment); // Guarda el pago
    }
}
