package com.sdia.infraction_microservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sdia.infraction_microservice.entities.Infraction;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.ToString;

import java.util.Arrays;

@Data
public class Vehicule {
    private long id;
    private String numMatricule;
    private String marque;
    private int puissanceFiscale;
    private String modele;
    private long infractionID; //foreign key of another distant entity (Product)
    Proprietaire proprietaire;

    Infraction infraction; /**entité etrangere qui se trouve dans le package models**/
    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", numMatricule='" + numMatricule + '\'' +
                ", marque='" + marque + '\'' +
                ", puissanceFiscale=" + puissanceFiscale +
                ", modele='" + modele + '\'' +
                ", infractionID=" + infractionID +
                ", proprietaire=" + proprietaire +
                ", infraction=" + infraction +
                '}';
    }
}

