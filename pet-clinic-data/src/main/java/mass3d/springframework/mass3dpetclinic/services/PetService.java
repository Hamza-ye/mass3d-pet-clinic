package mass3d.springframework.mass3dpetclinic.services;

import mass3d.springframework.mass3dpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Hamza on 25/04/2021.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
