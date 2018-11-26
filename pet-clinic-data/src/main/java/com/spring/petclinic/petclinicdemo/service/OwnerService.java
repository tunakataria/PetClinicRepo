package com.spring.petclinic.petclinicdemo.service;

import com.spring.petclinic.petclinicdemo.model.Owner;

public interface OwnerService {


    Owner findById();

    Owner findByLastName();

    Long save();

    void delete();


}
