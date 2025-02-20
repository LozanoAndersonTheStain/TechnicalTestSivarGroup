package com.technical.test.technicaltestsivargroup.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "point_of_sale")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PointOfSaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String address;

    @Column(nullable = false, length = 50)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyEntity company;
}