package mass3d.springframework.mass3dpetclinic.services;

import mass3d.springframework.mass3dpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Hamza on 25/04/2021.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
