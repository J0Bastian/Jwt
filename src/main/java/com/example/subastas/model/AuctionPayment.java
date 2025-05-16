package com.example.subastas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "auction_payment") // La colección en MongoDB
public class AuctionPayment {

    @Id
    private String id;

    private String auctionTransactionId; // ID de la transacción de subasta
    private double amount;               // Monto pagado
    private Date paymentDate;            // Fecha de pago
    private String paymentMethod;        // Método de pago (por ejemplo, tarjeta, transferencia)
    private String status;               // Estado del pago (ej. completado, pendiente)
    private String createdAt;            // Fecha de creación del registro
    private String updatedAt;            // Fecha de última actualización

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuctionTransactionId() {
        return auctionTransactionId;
    }

    public void setAuctionTransactionId(String auctionTransactionId) {
        this.auctionTransactionId = auctionTransactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "AuctionPayment{" +
                "id='" + id + '\'' +
                ", auctionTransactionId='" + auctionTransactionId + '\'' +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
