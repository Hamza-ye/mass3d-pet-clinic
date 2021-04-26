package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.Owner;
import mass3d.springframework.mass3dpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 26/04/2021.
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
