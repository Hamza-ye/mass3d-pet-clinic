package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.Pet;
import mass3d.springframework.mass3dpetclinic.services.PetService;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 26/04/2021.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
