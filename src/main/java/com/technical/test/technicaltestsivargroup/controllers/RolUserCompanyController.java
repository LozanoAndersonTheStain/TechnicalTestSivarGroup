package com.technical.test.technicaltestsivargroup.controllers;

import com.technical.test.technicaltestsivargroup.entities.RolUserCompanyEntity;
import com.technical.test.technicaltestsivargroup.services.RolUserCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rolUserCompany")
public class RolUserCompanyController {
    @Autowired
    private RolUserCompanyService rolUserCompanyService;

    @GetMapping("/getAllRolUserCompanies")
    public List<RolUserCompanyEntity> getAllRolUserCompanies() {
        return rolUserCompanyService.getAllRolUserCompanies();
    }

    @GetMapping("/{id}")
    public RolUserCompanyEntity getRolUserCompanyById(@PathVariable Long id) {
        return rolUserCompanyService.getRolUserCompanyById(id);
    }

    @PostMapping("/createRolUserCompany")
    public RolUserCompanyEntity saveRolUserCompany(@RequestBody RolUserCompanyEntity rolUserCompany) {
        return rolUserCompanyService.saveRolUserCompany(rolUserCompany);
    }

    @PutMapping("/update/{id}")
    public RolUserCompanyEntity updateRolUserCompany(@PathVariable Long id, @RequestBody RolUserCompanyEntity rolUserCompany) {
        return rolUserCompanyService.updateRolUserCompany(rolUserCompany);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRolUserCompany(@PathVariable Long id) {
        rolUserCompanyService.deleteRolUserCompany(id);
    }
}