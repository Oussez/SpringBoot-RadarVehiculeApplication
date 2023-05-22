package com.sdia.immatriculationservice.models;

import lombok.Data;

@Data
public class Infraction {
    private long id;
    private int numRadar;
    private double vitesseVehicule;
    private double montant;

    @Override
    public String toString() {
        return "Infraction{" +
                "id=" + id +
                ", numRadar=" + numRadar +
                ", vitesseVehicule=" + vitesseVehicule +
                ", montant=" + montant +
                '}';
    }
}
