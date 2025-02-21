package com.technical.test.technicaltestsivargroup.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "rol_user_company")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class RolUserCompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private CompanyEntity companyEntity;

    private String rol;
}
