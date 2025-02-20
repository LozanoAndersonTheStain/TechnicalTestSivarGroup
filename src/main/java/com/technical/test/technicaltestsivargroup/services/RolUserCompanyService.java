package com.technical.test.technicaltestsivargroup.services;

import com.technical.test.technicaltestsivargroup.entities.RolUserCompanyEntity;
import com.technical.test.technicaltestsivargroup.repositories.RolUserCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolUserCompanyService {
    @Autowired
    private RolUserCompanyRepository rolUserCompanyRepository;

    public List<RolUserCompanyEntity> getAllRolUserCompanies() {
        return rolUserCompanyRepository.findAll();
    }

    public RolUserCompanyEntity getRolUserCompanyById(Long id) {
        return rolUserCompanyRepository.findById(id).orElse(null);
    }

    public RolUserCompanyEntity saveRolUserCompany(RolUserCompanyEntity rolUserCompany) {
        return rolUserCompanyRepository.save(rolUserCompany);
    }

    public void deleteRolUserCompany(Long id) {
        rolUserCompanyRepository.deleteById(id);
    }

    public RolUserCompanyEntity updateRolUserCompany(RolUserCompanyEntity rolUserCompany) {
        return rolUserCompanyRepository.save(rolUserCompany);
    }
}