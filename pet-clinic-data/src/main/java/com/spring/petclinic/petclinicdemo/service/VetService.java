package com.spring.petclinic.petclinicdemo.service;

import com.spring.petclinic.petclinicdemo.model.Vet;
import org.springframework.stereotype.Service;

@Service
public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);
}
