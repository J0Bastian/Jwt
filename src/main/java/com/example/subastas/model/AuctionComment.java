package com.example.subastas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "auction_comment")  // La colección de MongoDB
public class AuctionComment {

    @Id
    private String id;               // ID único del comentario
    private String auctionItemId;    // ID del artículo de subasta relacionado
    private String userId;           // ID del usuario que hace el comentario
    private String comment;          // El contenido del comentario
    private Date commentDate;        // Fecha en la que se hizo el comentario
    private String createdAt;        // Fecha de creación del comentario
    private String updatedAt;        // Fecha de última actualización del comentario

    // Constructor por defecto
    public AuctionComment() {}

    // Constructor con parámetros
    public AuctionComment(String auctionItemId, String userId, String comment, Date commentDate, String createdAt, String updatedAt) {
        this.auctionItemId = auctionItemId;
        this.userId = userId;
        this.comment = comment;
        this.commentDate = commentDate;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
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
        return "AuctionComment{" +
                "id='" + id + '\'' +
                ", auctionItemId='" + auctionItemId + '\'' +
                ", userId='" + userId + '\'' +
                ", comment='" + comment + '\'' +
                ", commentDate=" + commentDate +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
