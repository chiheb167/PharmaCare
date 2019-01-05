package info.eniso.pharmacare.repository;

import info.eniso.pharmacare.model.Pharmacy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepository extends CrudRepository<Pharmacy, Long> {

}
