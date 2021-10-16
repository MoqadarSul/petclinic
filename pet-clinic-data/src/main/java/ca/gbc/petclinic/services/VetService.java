package ca.gbc.petclinic.services;

public interface VetService {
    Vet findById(Long id);
    Vet saved(Vet vet);
    Set<Vet> findAll();

}
