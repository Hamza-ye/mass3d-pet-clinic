package mass3d.springframework.mass3dpetclinic.services;

import mass3d.springframework.mass3dpetclinic.model.Owner;

/**
 * Created by Hamza on 25/04/2021.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
