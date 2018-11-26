package com.spring.petclinic.petclinicdemo.service;

import com.spring.petclinic.petclinicdemo.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByOwnerId();

    Set<Pet> finAll();

    void delete();
}
