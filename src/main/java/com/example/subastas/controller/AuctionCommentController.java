package com.example.subastas.controller;

import com.example.subastas.model.AuctionComment;
import com.example.subastas.service.AuctionCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auction_comment") // Controlador para las rutas relacionadas con los comentarios de subasta
public class AuctionCommentController {

    @Autowired
    private AuctionCommentService auctionCommentService;

    // Endpoint para obtener todos los comentarios (GET)
    @GetMapping
    public List<AuctionComment> getAllComments() {
        return auctionCommentService.getAllComments(); // Devuelve todos los comentarios
    }

    // Endpoint para obtener comentarios de un artículo de subasta específico (GET)
    @GetMapping("/auction/{auctionItemId}")
    public List<AuctionComment> getCommentsByAuctionItemId(@PathVariable String auctionItemId) {
        return auctionCommentService.getCommentsByAuctionItemId(auctionItemId); // Devuelve los comentarios de un artículo específico
    }

    // Endpoint para agregar un nuevo comentario (POST) - solo si fuera necesario para la prueba
    @PostMapping
    public AuctionComment createComment(@RequestBody AuctionComment comment) {
        return auctionCommentService.createComment(comment); // Crea y guarda el nuevo comentario
    }
}
