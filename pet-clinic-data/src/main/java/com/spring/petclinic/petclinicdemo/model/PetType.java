package com.spring.petclinic.petclinicdemo.model;

public class PetType extends BaseEntity {

    String petType;

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
}
