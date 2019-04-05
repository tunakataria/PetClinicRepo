package com.spring.petclinic.petclinicdemo.bootstrap;

import com.spring.petclinic.petclinicdemo.model.Owner;
import com.spring.petclinic.petclinicdemo.model.PetType;
import com.spring.petclinic.petclinicdemo.model.Vet;
import com.spring.petclinic.petclinicdemo.service.OwnerService;
import com.spring.petclinic.petclinicdemo.service.PetTypeService;
import com.spring.petclinic.petclinicdemo.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class DataLoader  implements CommandLineRunner {

    OwnerService ownerService;
    VetService vetService;
    PetTypeService petTypeService;

    @Autowired
    private DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setPetType("Dog");
        petTypeService.save(dog);

        System.out.println("Saved dog type pet");

        PetType cat = new PetType();
        cat.setPetType("Cat");
        petTypeService.save(cat);
        System.out.println("Saved Cat type pet");


        Owner owner = new Owner();
        owner.setFirstName("Pablo");
        owner.setLastName("Escobar");
        ownerService.save(owner);
        System.out.println("Owners saved.....");
        Vet vet = new Vet();
        vet.setFirstName("Diana");
        vet.setLastName("Panty");
        vetService.save(vet);
        System.out.println("Vet Saved.....");
    }
}
