package com.sdia.radar_microservice.models;

import lombok.Data;
import lombok.ToString;

import java.util.Collection;

@Data

public class Proprietaire {
    private long id;
    private String nom;
    private String email;
    private Collection<Vehicule> vehicules;

    @Override
    public String toString() {
        return "Proprietaire{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

