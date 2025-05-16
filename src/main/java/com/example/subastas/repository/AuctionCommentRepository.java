package com.example.subastas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.subastas.model.AuctionComment;
import java.util.List;

public interface AuctionCommentRepository extends MongoRepository<AuctionComment, String> {
    // Método para obtener los comentarios por el ID del artículo de subasta
    List<AuctionComment> findAllByAuctionItemId(String auctionItemId);
}
