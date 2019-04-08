package com.spring.petclinic.petclinicdemo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="pet_types")
public class PetType extends BaseEntity {
    @Column(name="pet_type")
    String petType;

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
}
