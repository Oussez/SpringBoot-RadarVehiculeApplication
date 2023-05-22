package com.sdia.infraction_microservice.entities;

import com.sdia.infraction_microservice.models.Radar;
import com.sdia.infraction_microservice.models.Vehicule;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Infraction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double vitesseVehicule;
    private double montantFraction;
    private String numMatricule;
    private long numRadar;
    @Transient
    private Radar radar;
    @Transient
    private Vehicule vehicule;

    @Override
    public String toString() {
        return "Infraction{" +
                "id=" + id +
                ", date=" + date +
                ", vitesseVehicule=" + vitesseVehicule +
                ", montantFraction=" + montantFraction +
                ", radar=" + radar +
                '}';
    }

    public Infraction(Date _date, double _vitesseVeh,double  _montantFraction,Radar _radar, Vehicule _vehicule ){
        this.id=null;
        this.date = _date;
        this.vitesseVehicule = _vitesseVeh;
        this.montantFraction = _montantFraction;
        this.radar = _radar;
        this.vehicule = _vehicule;
        if(_radar != null )
            this.numRadar = _radar.getId();
        if(_vehicule != null)
            this.numMatricule = _vehicule.getNumMatricule();
    }
}
