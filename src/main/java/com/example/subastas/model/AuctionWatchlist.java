package com.example.subastas.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "auction_watchlist")
public class AuctionWatchlist {
    private String id;
    private String userId; // ID del usuario
    private String auctionItemId; // ID de la subasta relacionada
    private String createdAt; // Fecha de creación de la vigilia
    private String updatedAt; // Fecha de última actualización

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAuctionItemId() {
        return auctionItemId;
    }

    public void setAuctionItemId(String auctionItemId) {
        this.auctionItemId = auctionItemId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
