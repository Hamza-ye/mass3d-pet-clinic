package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.Vet;
import mass3d.springframework.mass3dpetclinic.services.CrudService;

/**
 * Created by Hamza on 26/04/2021.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
