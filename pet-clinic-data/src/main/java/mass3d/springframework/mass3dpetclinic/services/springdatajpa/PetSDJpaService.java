package mass3d.springframework.mass3dpetclinic.services.springdatajpa;

import mass3d.springframework.mass3dpetclinic.model.Pet;
import mass3d.springframework.mass3dpetclinic.repositories.PetRepository;
import mass3d.springframework.mass3dpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 30/04/2021.
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaService extends AbstractSDJpaService<Pet, Long, PetRepository>
        implements PetService {

    public PetSDJpaService(PetRepository repository) {
        super(repository);
    }
}
