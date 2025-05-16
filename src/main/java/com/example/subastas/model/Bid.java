package com.example.subastas.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "bid") // Asegúrate de que la colección de MongoDB se llame "bids" o el nombre que quieras
public class Bid {

    @Id
    private String id;

    private String auctionItemId; // ID de la subasta relacionada
    private double bidAmount;     // Monto de la oferta
    private String bidderId;      // ID del ofertante
    private String bidTime;       // Hora de la oferta



    // Constructor por defecto
    public Bid() {}

    // Constructor con parámetros
    public Bid(String auctionItemId, double bidAmount, String bidderId, String bidTime) {
        this.auctionItemId = auctionItemId;
        this.bidAmount = bidAmount;
        this.bidderId = bidderId;
        this.bidTime = bidTime;
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

    public double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public String getBidderId() {
        return bidderId;
    }

    public void setBidderId(String bidderId) {
        this.bidderId = bidderId;
    }

    public String getBidTime() {
        return bidTime;
    }

    public void setBidTime(String bidTime) {
        this.bidTime = bidTime;
    }

  

    // Métodos toString(), equals(), hashCode() si es necesario
    @Override
    public String toString() {
        return "Bid{" +
                "id='" + id + '\'' +
                ", auctionItemId='" + auctionItemId + '\'' +
                ", bidAmount=" + bidAmount +
                ", bidderId='" + bidderId + '\'' +
                ", bidTime='" + bidTime + '\'' +
                '}';
    }
}
