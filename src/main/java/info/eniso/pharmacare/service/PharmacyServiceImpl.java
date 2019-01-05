package info.eniso.pharmacare.service;

import info.eniso.pharmacare.model.Pharmacy;
import info.eniso.pharmacare.repository.PharmacyRepository;
import org.springframework.stereotype.Service;

@Service
public class PharmacyServiceImpl implements PharmacyService{

    private PharmacyRepository pharmacyRepository;

    public PharmacyServiceImpl(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    @Override
    public Iterable<Pharmacy> list() {
        return this.pharmacyRepository.findAll();
    }

    @Override
    public Pharmacy save(Pharmacy pharmacy) {
        return this.pharmacyRepository.save(pharmacy);
    }
}
