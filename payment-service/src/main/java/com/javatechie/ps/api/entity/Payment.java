package com.javatechie.ps.api.entity;


;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    int paymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;
}
