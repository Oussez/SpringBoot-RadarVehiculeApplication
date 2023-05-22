package com.sdia.immatriculationservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sdia.immatriculationservice.models.Infraction;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicule {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numMatricule;
    private String marque;
    private int puissanceFiscale;
    private String modele;
    private Long infractionID; //foreign key of another distant entity (Product)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) /**pour afficher bien le format json lors des requetes api**/
    @ManyToOne
    Proprietaire proprietaire;
    @Transient
    Infraction infraction; /**entité etrangere qui se trouve dans le package models**/
    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", numMatricule='" + numMatricule + '\'' +
                ", marque='" + marque + '\'' +
                ", puissanceFiscale=" + puissanceFiscale +
                ", infractionID=" + infractionID +
                ", proprietaire=" + proprietaire +
                '}';
    }
}
