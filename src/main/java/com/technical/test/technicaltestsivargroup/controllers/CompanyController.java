package com.technical.test.technicaltestsivargroup.controllers;

import com.technical.test.technicaltestsivargroup.entities.CompanyEntity;
import com.technical.test.technicaltestsivargroup.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/getAllCompanies")
    public List<CompanyEntity> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public CompanyEntity getCompanyById(@PathVariable Long id) {
        return companyService.getCompanyById(id);
    }

    @PostMapping("/createCompany")
    public CompanyEntity saveCompany(@RequestBody CompanyEntity company) {
        return companyService.saveCompany(company);
    }

    @PutMapping("/update/{id}")
    public CompanyEntity updateCompany(@PathVariable Long id, @RequestBody CompanyEntity company) {
        return companyService.updateCompany(company);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }
}
