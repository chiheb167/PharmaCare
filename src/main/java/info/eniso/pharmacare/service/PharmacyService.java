package info.eniso.pharmacare.service;


import info.eniso.pharmacare.model.Pharmacy;

public interface PharmacyService {

    Iterable<Pharmacy> list();

    Pharmacy save(Pharmacy pharmacy);
}
