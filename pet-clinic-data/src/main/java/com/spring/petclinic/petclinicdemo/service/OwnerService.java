package com.spring.petclinic.petclinicdemo.service;

import com.spring.petclinic.petclinicdemo.model.Owner;
import org.springframework.stereotype.Service;

@Service
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
