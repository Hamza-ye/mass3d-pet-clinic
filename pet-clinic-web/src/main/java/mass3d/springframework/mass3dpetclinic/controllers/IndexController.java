package mass3d.springframework.mass3dpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hamza on 26/04/2021.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){

        return "notimplemented";
    }
}
