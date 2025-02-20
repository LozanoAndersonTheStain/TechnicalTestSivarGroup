package com.technical.test.technicaltestsivargroup.controllers;

import com.technical.test.technicaltestsivargroup.entities.PointOfSaleEntity;
import com.technical.test.technicaltestsivargroup.services.PointOfSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pointOfSales")
public class PointOfSaleController {
    @Autowired
    private PointOfSaleService pointOfSaleService;

    @GetMapping("/getAllPointOfSales")
    public List<PointOfSaleEntity> getAllPointOfSales() {
        return pointOfSaleService.getAllPointOfSales();
    }

    @GetMapping("/{id}")
    public PointOfSaleEntity getPointOfSaleById(@PathVariable Long id) {
        return pointOfSaleService.getPointOfSaleById(id);
    }

    @PostMapping("/createPointOfSale")
    public PointOfSaleEntity savePointOfSale(@RequestBody PointOfSaleEntity pointOfSale) {
        return pointOfSaleService.savePointOfSale(pointOfSale);
    }

    @PutMapping("/update/{id}")
    public PointOfSaleEntity updatePointOfSale(@PathVariable Long id, @RequestBody PointOfSaleEntity pointOfSale) {
        return pointOfSaleService.updatePointOfSale(pointOfSale);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePointOfSale(@PathVariable Long id) {
        pointOfSaleService.deletePointOfSale(id);
    }
}