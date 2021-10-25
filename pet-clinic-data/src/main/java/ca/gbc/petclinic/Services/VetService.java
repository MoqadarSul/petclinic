package ca.gbc.petclinic.Services;

import ca.gbc.petclinic.model.Pet;
import ca.gbc.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
