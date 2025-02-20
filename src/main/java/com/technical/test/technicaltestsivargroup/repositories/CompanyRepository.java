package com.technical.test.technicaltestsivargroup.repositories;

import com.technical.test.technicaltestsivargroup.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    boolean existsByNit(String nit);
}