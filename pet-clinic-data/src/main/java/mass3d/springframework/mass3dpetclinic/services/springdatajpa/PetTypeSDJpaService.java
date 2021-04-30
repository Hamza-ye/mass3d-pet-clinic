package mass3d.springframework.mass3dpetclinic.services.springdatajpa;

import mass3d.springframework.mass3dpetclinic.model.PetType;
import mass3d.springframework.mass3dpetclinic.repositories.PetTypeRepository;
import mass3d.springframework.mass3dpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 30/04/2021.
 */
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService extends AbstractSDJpaService<PetType, Long, PetTypeRepository>
        implements PetTypeService {

    public PetTypeSDJpaService(PetTypeRepository repository) {
        super(repository);
    }
}
