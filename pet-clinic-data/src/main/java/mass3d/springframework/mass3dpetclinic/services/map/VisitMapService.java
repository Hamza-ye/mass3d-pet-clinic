package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.Visit;
import mass3d.springframework.mass3dpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 01/05/2021.
 */
@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Visit save(Visit object) {

        if (object.getPet() == null || object.getPet().getOwner() == null
                || object.getPet().getId() == null || object.getPet().getOwner().getId() == null)
            throw new RuntimeException("Invalid Visit");

        return super.save(object);
    }
}
