package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.PetType;
import mass3d.springframework.mass3dpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 29/04/2021.
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
