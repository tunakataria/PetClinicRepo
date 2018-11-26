package com.spring.petclinic.petclinicdemo.service;

import com.spring.petclinic.petclinicdemo.model.Vet;

public interface VetService {


    Vet findById();

    Vet findByLastName();

    Long save();

    void delete();
}
