package info.eniso.pharmacare.service;

import info.eniso.pharmacare.repository.MedicineRepository;
import org.springframework.stereotype.Service;

@Service
public class MedicineServiceImpl implements MedicineService {

    private MedicineRepository medicineRepository;

    public MedicineServiceImpl(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }
}
