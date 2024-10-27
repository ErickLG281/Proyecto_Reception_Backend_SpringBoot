package com.ggs.receptionbackend.entity.process_booking;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    private String information;


    @ManyToOne(
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "payment_method_id",
            referencedColumnName = "paymentMethodId"
    )
    private PaymentMethod paymentMethod;

}