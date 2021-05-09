package mass3d.springframework.mass3dpetclinic.formatters;

import mass3d.springframework.mass3dpetclinic.model.PetType;
import mass3d.springframework.mass3dpetclinic.services.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

/**
 * Created by Hamza on 10/05/2021.
 */
@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }


    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> foundPetTypes = petTypeService.findAll();

        for (PetType type : foundPetTypes) {

            if (type.getName().equals(text))
                return type;
        }

        throw new ParseException("type not found: " + text, 0);
    }

    @Override
    public String print(PetType type, Locale locale) {
        return type.getName();
    }
}
