package com.spring.petclinic.petclinicdemo.bootstrap;

import com.spring.petclinic.petclinicdemo.model.Owner;
import com.spring.petclinic.petclinicdemo.model.Vet;
import com.spring.petclinic.petclinicdemo.service.Map.OwnerMapService;
import com.spring.petclinic.petclinicdemo.service.Map.VetMapService;
import com.spring.petclinic.petclinicdemo.service.OwnerService;
import com.spring.petclinic.petclinicdemo.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner {

    OwnerService ownerService;
    VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();

        owner.setId(1L);
        owner.setFirstName("Pablo");
        owner.setLastName("Escobar");

        ownerService.save(owner);
        System.out.println("Owners saved.....");

        Vet vet = new Vet();
        vet.setFirstName("Diana");
        vet.setLastName("Panty");
        vet.setId(1L);

        vetService.save(vet);

        System.out.println("Vet Saved.....");
    }
}
