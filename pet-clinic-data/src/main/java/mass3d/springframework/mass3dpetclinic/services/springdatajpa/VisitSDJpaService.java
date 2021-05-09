package mass3d.springframework.mass3dpetclinic.services.springdatajpa;

import mass3d.springframework.mass3dpetclinic.model.Visit;
import mass3d.springframework.mass3dpetclinic.repositories.VisitRepository;
import mass3d.springframework.mass3dpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Hamza on 01/05/2021.
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService extends AbstractSDJpaService<Visit, Long, VisitRepository>
        implements VisitService {

    public VisitSDJpaService(VisitRepository repository) {
        super(repository);
    }

    @Override
    public List<Visit> findByPetId(Long petId) {
        return repository.findByPetId(petId);
    }
}
