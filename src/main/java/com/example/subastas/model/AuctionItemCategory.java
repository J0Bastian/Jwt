package com.example.subastas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "auction_item_category")
public class AuctionItemCategory {

    @Id
    private String id; // ID único del documento, generado automáticamente por MongoDB
    private String auctionItemId; // ID del artículo de subasta
    private String categoryId; // ID de la categoría a la que pertenece el artículo
    private String createdAt; // Fecha de creación
    private String updatedAt; // Fecha de última actualización

    // Constructor por defecto
    public AuctionItemCategory() {}

    // Constructor con parámetros
    public AuctionItemCategory(String auctionItemId, String categoryId, String createdAt, String updatedAt) {
        this.auctionItemId = auctionItemId;
        this.categoryId = categoryId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuctionItemId() {
        return auctionItemId;
    }

    public void setAuctionItemId(String auctionItemId) {
        this.auctionItemId = auctionItemId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
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

    @Override
    public String toString() {
        return "AuctionItemCategory{" +
                "id='" + id + '\'' +
                ", auctionItemId='" + auctionItemId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
