package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.Vet;
import mass3d.springframework.mass3dpetclinic.services.VetService;
import org.springframework.stereotype.Service;

/**
 * Created by Hamza on 26/04/2021.
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

}
