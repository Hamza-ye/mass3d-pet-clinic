package mass3d.springframework.mass3dpetclinic.services.springdatajpa;

import mass3d.springframework.mass3dpetclinic.model.Vet;
import mass3d.springframework.mass3dpetclinic.repositories.VetRepository;
import mass3d.springframework.mass3dpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 30/04/2021.
 */
@Service
@Profile("springdatajpa")
public class VetSDJpaService extends AbstractSDJpaService<Vet, Long, VetRepository>
        implements VetService {

    public VetSDJpaService(VetRepository repository) {
        super(repository);
    }
}
