package com.sdia.radar_microservice.entities;

import com.sdia.radar_microservice.models.Infraction;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder @Getter
public class Radar {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double vitesseMax;
    private double [] coordonnees;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Long> ListIdInfraction;
    @Transient
    private Infraction infraction;


    public Radar(Long id, double vitesseMax, double[] coordonnees, List<Long> IDsInfraction) {
        this.id = id;
        this.vitesseMax = vitesseMax;
        this.coordonnees = coordonnees;
        this.ListIdInfraction = IDsInfraction;
    }

}
