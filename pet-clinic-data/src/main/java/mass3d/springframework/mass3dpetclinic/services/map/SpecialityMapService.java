package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.Specialty;
import mass3d.springframework.mass3dpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 29/04/2021.
 */
@Service
public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialityService {
}
