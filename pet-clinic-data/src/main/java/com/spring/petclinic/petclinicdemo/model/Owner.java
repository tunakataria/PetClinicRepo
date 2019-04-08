package com.spring.petclinic.petclinicdemo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Owners")
public class Owner extends Person{

    @Column(name="address")
    String address;

    @Column(name="telephone")
    String telephone;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "owner")
    Set<Pet> pets = new HashSet<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
