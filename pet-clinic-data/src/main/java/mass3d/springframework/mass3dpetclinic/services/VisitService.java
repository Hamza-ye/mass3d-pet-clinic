package mass3d.springframework.mass3dpetclinic.services;

import mass3d.springframework.mass3dpetclinic.model.Visit;

import java.util.List;

/**
 * Created by Hamza on 01/05/2021.
 */
public interface VisitService extends CrudService<Visit, Long> {
    List<Visit> findByPetId(Long petId);
}
