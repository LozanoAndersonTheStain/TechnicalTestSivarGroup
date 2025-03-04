package com.technical.test.technicaltestsivargroup.services;

import com.technical.test.technicaltestsivargroup.entities.PointOfSaleEntity;
import com.technical.test.technicaltestsivargroup.exeptions.DuplicateEntityException;
import com.technical.test.technicaltestsivargroup.repositories.PointOfSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointOfSaleService {
    @Autowired
    private PointOfSaleRepository pointOfSaleRepository;

    public List<PointOfSaleEntity> getAllPointOfSales() {
        return pointOfSaleRepository.findAll();
    }

    public PointOfSaleEntity getPointOfSaleById(Long id) {
        return pointOfSaleRepository.findById(id).orElse(null);
    }

    public PointOfSaleEntity savePointOfSale(PointOfSaleEntity pointOfSale) {
        if (pointOfSaleRepository.existsByNameAndAddress(pointOfSale.getName(), pointOfSale.getAddress())) {
            throw new DuplicateEntityException("Point of Sale with name " + pointOfSale.getName() + " and address " + pointOfSale.getAddress() + " already exists.");
        }
        return pointOfSaleRepository.save(pointOfSale);
    }

    public void deletePointOfSale(Long id) {
        pointOfSaleRepository.deleteById(id);
    }

    public PointOfSaleEntity updatePointOfSale(PointOfSaleEntity pointOfSale) {
        return pointOfSaleRepository.save(pointOfSale);
    }
}