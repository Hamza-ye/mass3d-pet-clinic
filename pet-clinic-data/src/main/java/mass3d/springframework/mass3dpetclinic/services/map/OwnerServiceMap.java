package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.Owner;
import mass3d.springframework.mass3dpetclinic.services.CrudService;

/**
 * Created by Hamza on 26/04/2021.
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
