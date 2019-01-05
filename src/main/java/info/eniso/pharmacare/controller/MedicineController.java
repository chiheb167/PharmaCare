package info.eniso.pharmacare.controller;

import info.eniso.pharmacare.service.MedicineService;
import info.eniso.pharmacare.service.PharmacyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/medicines")
public class MedicineController {

    private MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

}
