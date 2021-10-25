package ca.gbc.petclinic.Services;

import ca.gbc.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}
