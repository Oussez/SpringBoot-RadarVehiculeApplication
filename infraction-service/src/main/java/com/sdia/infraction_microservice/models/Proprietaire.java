package com.sdia.infraction_microservice.models;

import com.sdia.infraction_microservice.entities.Infraction;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.Data;

import java.util.Collection;

@Data
public class Proprietaire {
    private long id;
    private String nom;
    private String email;
    private Collection<Vehicule> vehicules;

}

