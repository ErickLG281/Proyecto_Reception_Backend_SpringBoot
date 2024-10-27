package com.ggs.receptionbackend.entity.reception_information;

import com.ggs.receptionbackend.entity.login.rols.Client;
import com.ggs.receptionbackend.entity.login.rols.Company;
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
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "company_id",
            referencedColumnName = "companyId"
    )
    private Company company;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "client_id",
            referencedColumnName = "clientId"
    )
    private Client client;

}
