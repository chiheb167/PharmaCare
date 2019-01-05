package info.eniso.pharmacare.controller;

import info.eniso.pharmacare.model.Pharmacy;
import info.eniso.pharmacare.service.PharmacyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pharmacies")
public class PharmacyController {

    private PharmacyService pharmacyService;

    public PharmacyController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @GetMapping("/")
    public Iterable<Pharmacy> list(){
        return this.pharmacyService.list();
    }

    @PostMapping("/save")
    public Pharmacy savePharmacy(@RequestBody Pharmacy pharmacy){
        return this.pharmacyService.save(pharmacy);
    }
}
