package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.Visit;
import mass3d.springframework.mass3dpetclinic.services.VisitService;

/**
 * Created by Hamza on 01/05/2021.
 */
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Visit save(Visit object) {

        if (object.getPet() == null || object.getPet().getOwner() == null
                || object.getPet().getId() == null || object.getPet().getOwner().getId() == null)
            throw new RuntimeException("Invalid Visit");

        return super.save(object);
    }
}
