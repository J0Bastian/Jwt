package com.example.subastas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "auction_item")
public class AuctionItem {

    @Id
    private String id;               // ID único de la subasta
    private String title;            // Título del artículo de subasta
    private String description;      // Descripción del artículo
    private double startingPrice;    // Precio de inicio
    private double reservePrice;     // Precio de reserva
    private double buyNowPrice;      // Precio de compra inmediata
    private Date auctionStart;       // Fecha de inicio de la subasta
    private Date auctionEnd;         // Fecha de finalización de la subasta
    private String status;           // Estado de la subasta (por ejemplo, activo, finalizado)
    private String sellerId;         // ID del vendedor
    private String imageUrl;         // URL de la imagen del artículo
    private Integer createdBy;       // ID del creador del artículo
    private Date createdAt;          // Fecha de creación
    private Integer updatedBy;       // ID de la última persona que actualizó el artículo
    private Date updatedAt;          // Fecha de última actualización

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }

    public double getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(double reservePrice) {
        this.reservePrice = reservePrice;
    }

    public double getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(double buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    public Date getAuctionStart() {
        return auctionStart;
    }

    public void setAuctionStart(Date auctionStart) {
        this.auctionStart = auctionStart;
    }

    public Date getAuctionEnd() {
        return auctionEnd;
    }

    public void setAuctionEnd(Date auctionEnd) {
        this.auctionEnd = auctionEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "AuctionItem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startingPrice=" + startingPrice +
                ", reservePrice=" + reservePrice +
                ", buyNowPrice=" + buyNowPrice +
                ", auctionStart=" + auctionStart +
                ", auctionEnd=" + auctionEnd +
                ", status='" + status + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
