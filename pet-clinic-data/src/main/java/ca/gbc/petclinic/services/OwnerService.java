package ca.gbc.petclinic.services;


public interface OwnerService {
    Owner findByLastname(String lastname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
