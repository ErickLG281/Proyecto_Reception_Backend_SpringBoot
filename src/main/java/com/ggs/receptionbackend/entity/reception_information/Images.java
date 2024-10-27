package com.ggs.receptionbackend.entity.reception_information;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="url_image")
    private String urlImage;

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
