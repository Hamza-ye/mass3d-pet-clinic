package mass3d.springframework.mass3dpetclinic.controllers;

import mass3d.springframework.mass3dpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hamza on 26/04/2021.
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String ListVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
