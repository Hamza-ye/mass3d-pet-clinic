package mass3d.springframework.mass3dpetclinic.repositories;

import mass3d.springframework.mass3dpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Hamza on 30/04/2021.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
