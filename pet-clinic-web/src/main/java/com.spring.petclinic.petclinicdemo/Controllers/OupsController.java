package com.spring.petclinic.petclinicdemo.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class OupsController {

    @RequestMapping({"/oups"})
    public String oupsHandler(){
        return "notimplemented";
    }
}
