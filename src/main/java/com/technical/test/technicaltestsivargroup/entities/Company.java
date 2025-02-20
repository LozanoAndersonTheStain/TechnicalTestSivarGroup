package com.technical.test.technicaltestsivargroup.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity(name = "companies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 70)
    private String name;

    @Column(nullable = false, length = 75)
    private String address;

    @Column(nullable = false, length = 10)
    private String nit;

    @Column(nullable = false, length = 50)
    private String phone;

    @ManyToMany
    @JoinTable(
            name = "company_point_of_sale",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "point_of_sale_id")
    )
    private Set<PointOfSale> pointOfSales;
}
