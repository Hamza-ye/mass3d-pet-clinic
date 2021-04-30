package mass3d.springframework.mass3dpetclinic.services.springdatajpa;

import mass3d.springframework.mass3dpetclinic.model.Owner;
import mass3d.springframework.mass3dpetclinic.repositories.OwnerRepository;
import mass3d.springframework.mass3dpetclinic.repositories.PetRepository;
import mass3d.springframework.mass3dpetclinic.repositories.PetTypeRepository;
import mass3d.springframework.mass3dpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 30/04/2021.
 */
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService extends AbstractSDJpaService<Owner, Long, OwnerRepository>
        implements OwnerService {

    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        super(ownerRepository);
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

}
