package mass3d.springframework.mass3dpetclinic.repositories;

import mass3d.springframework.mass3dpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Hamza on 30/04/2021.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {

    List<Visit> findByPetId(Long petId);
}
