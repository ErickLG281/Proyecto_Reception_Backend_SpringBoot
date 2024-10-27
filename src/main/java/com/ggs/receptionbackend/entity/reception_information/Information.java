package com.ggs.receptionbackend.entity.reception_information;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ggs.receptionbackend.entity.login.rols.Company;
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
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 5000)
    private String description;
    private int MaxQuantity;
    private int MinQuantity;
    private BigDecimal initialPrice;

    @OneToOne(
            cascade = CascadeType.MERGE,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "companu_id",
            referencedColumnName = "companyId"
    )
    @JsonIgnore
    private Company company;
}
