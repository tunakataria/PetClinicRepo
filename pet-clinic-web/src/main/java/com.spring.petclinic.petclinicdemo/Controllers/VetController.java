package com.spring.petclinic.petclinicdemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets.html"})
    public String listVets(){
        return "vets/index";
    }
}
