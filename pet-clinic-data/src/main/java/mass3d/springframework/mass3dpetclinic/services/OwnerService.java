package mass3d.springframework.mass3dpetclinic.services;

import mass3d.springframework.mass3dpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Hamza on 25/04/2021.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
