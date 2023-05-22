package com.sdia.radar_microservice.models;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Date;
import com.sdia.radar_microservice.entities.Radar;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Infraction {
    private Long id;
    private Date date;
    private double vitesseVehicule;
    private double montantFraction;
    private String numMatricule;
    private Long numRadar;
    private Radar radar;
    private Vehicule vehicule;

    @Override
    public String toString() {
        return "Infraction{" +
                "id=" + id +
                ", date=" + date +
                ", vitesseVehicule=" + vitesseVehicule +
                ", montantFraction=" + montantFraction +
                ", numMatricule='" + numMatricule + '\'' +
                ", numRadar=" + numRadar +
                ", vehicule=" + vehicule +
                '}';
    }
}

