package com.sdia.infraction_microservice.models;

import lombok.Data;
import lombok.ToString;

import java.util.Arrays;

@Data
public class Radar {
    private long id;
    private double vitesseMax;
    private double [] coordonnees;

    @Override
    public String toString() {
        return "Radar{" +
                "id=" + id +
                ", vitesseMax=" + vitesseMax +
                ", coordonnees=" + Arrays.toString(coordonnees) +
                '}';
    }
}

