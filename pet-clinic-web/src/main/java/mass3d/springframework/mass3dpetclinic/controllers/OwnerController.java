package mass3d.springframework.mass3dpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hamza on 26/04/2021.
 */
@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listOwners(){

        return "owners/index.html";
    }
}
