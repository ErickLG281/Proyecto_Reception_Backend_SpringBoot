package com.ggs.receptionbackend.entity.login.rols;

import com.ggs.receptionbackend.entity.login.User;
import com.ggs.receptionbackend.entity.reception_information.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    private String name;
    private String location;
    private String email;
    @Column(unique = true)
    private int phoneNumber;

    @OneToOne(
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "userId"
    )
    private User user;

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "company_category_map",
            joinColumns = @JoinColumn(
                    name = "company_id",
                    referencedColumnName = "companyId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "category_id",
                    referencedColumnName = "categoryId"
            )
    )
    private List<Category> categories;
}
