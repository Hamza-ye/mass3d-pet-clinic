package mass3d.springframework.mass3dpetclinic.services.springdatajpa;

import mass3d.springframework.mass3dpetclinic.model.Specialty;
import mass3d.springframework.mass3dpetclinic.repositories.SpecialityRepository;
import mass3d.springframework.mass3dpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 30/04/2021.
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService extends AbstractSDJpaService<Specialty, Long, SpecialityRepository>
        implements SpecialityService {

    public SpecialitySDJpaService(SpecialityRepository repository) {
        super(repository);
    }
}
