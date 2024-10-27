package com.ggs.receptionbackend.entity.process_booking;

import com.ggs.receptionbackend.entity.login.rols.Client;
import com.ggs.receptionbackend.entity.login.rols.Company;
import com.ggs.receptionbackend.entity.reception_information.Calendar;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @ManyToOne(
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "client_id",
            referencedColumnName = "clientId"
    )
    private Client client;

    @ManyToOne(
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "company_id",
            referencedColumnName = "companyId"
    )
    private Company company;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "calendar_id",
            referencedColumnName = "calendarId"
    )
    private Calendar calendar;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "transaction_id",
            referencedColumnName = "transactionId"
    )
    private Transaction transaction;
}
