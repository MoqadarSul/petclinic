package ca.gbc.petclinic.controllers;

import ca.gbc.petclinic.Services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"","/","index.html"})
    public String index(){
        return "index";
    }



}
