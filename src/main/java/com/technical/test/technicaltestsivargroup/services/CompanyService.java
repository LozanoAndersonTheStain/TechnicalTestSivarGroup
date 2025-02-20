package com.technical.test.technicaltestsivargroup.services;

import com.technical.test.technicaltestsivargroup.entities.CompanyEntity;
import com.technical.test.technicaltestsivargroup.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public List<CompanyEntity> getAllCompanies() {
        return companyRepository.findAll();
    }

    public CompanyEntity getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    public CompanyEntity saveCompany(CompanyEntity company) {
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    public CompanyEntity updateCompany(CompanyEntity company) {
        return companyRepository.save(company);
    }
}
