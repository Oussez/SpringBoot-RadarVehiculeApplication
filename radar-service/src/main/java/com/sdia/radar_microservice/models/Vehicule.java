package com.sdia.radar_microservice.models;

import lombok.Data;

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

