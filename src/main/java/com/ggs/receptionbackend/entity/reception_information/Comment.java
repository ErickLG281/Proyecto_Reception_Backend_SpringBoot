package com.ggs.receptionbackend.entity.reception_information;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ggs.receptionbackend.entity.login.rols.Client;
import com.ggs.receptionbackend.entity.login.rols.Company;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date date;

    private boolean recommended;
    private int qualityService;
    private int responseTime;
    private int professionalism;
    private int qualityPrice;
    private int flexibility;

    @ManyToOne(
            cascade = CascadeType.MERGE,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "client_id",
            referencedColumnName = "clientId"
    )
    @JsonIgnore
    private Client client;

    @ManyToOne(
            cascade = CascadeType.MERGE,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "company_id",
            referencedColumnName = "companyId"
    )
    @JsonIgnore
    private Company company;
}
