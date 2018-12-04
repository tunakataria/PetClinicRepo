package com.spring.petclinic.petclinicdemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners","/owners.html"})
@Controller
public class OwnerController {

    @RequestMapping({})
    public String listOwners(){
        return "owners/index";

    }
}
