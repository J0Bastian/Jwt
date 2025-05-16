package com.example.subastas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.subastas.model.AuctionComment;
import com.example.subastas.repository.AuctionCommentRepository;
import java.util.List;

@Service
public class AuctionCommentService {

    @Autowired
    private AuctionCommentRepository auctionCommentRepository;

    // Obtener todos los comentarios
    public List<AuctionComment> getAllComments() {
        return auctionCommentRepository.findAll(); // Devuelve todos los comentarios
    }

    // Obtener comentarios de un artículo de subasta específico
    public List<AuctionComment> getCommentsByAuctionItemId(String auctionItemId) {
        return auctionCommentRepository.findAllByAuctionItemId(auctionItemId); // Busca los comentarios por `auctionItemId`
    }

    // Crear un nuevo comentario
    public AuctionComment createComment(AuctionComment comment) {
        return auctionCommentRepository.save(comment); // Guarda el nuevo comentario
    }
}
