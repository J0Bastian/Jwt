package com.example.subastas.controller;

import com.example.subastas.model.AuctionPayment;
import com.example.subastas.service.AuctionPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auction_payment") // Controlador para las rutas relacionadas con los pagos de subasta
public class AuctionPaymentController {

    private final AuctionPaymentService auctionPaymentService;

    // Inyección de dependencias mediante constructor
    @Autowired
    public AuctionPaymentController(AuctionPaymentService auctionPaymentService) {
        this.auctionPaymentService = auctionPaymentService;
    }

    // Endpoint para obtener todos los pagos (GET)
    @GetMapping
    public List<AuctionPayment> getAllPayments() {
        return auctionPaymentService.getAllPayments(); // Devuelve todos los pagos
    }

    // Endpoint para obtener los pagos de una transacción de subasta específica (GET)
    @GetMapping("/transaction/{auctionTransactionId}")
    public List<AuctionPayment> getPaymentsByAuctionTransactionId(@PathVariable String auctionTransactionId) {
        return auctionPaymentService.getPaymentsByAuctionTransactionId(auctionTransactionId); // Devuelve los pagos de la transacción
    }

}
