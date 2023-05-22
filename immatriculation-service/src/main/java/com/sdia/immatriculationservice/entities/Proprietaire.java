package com.sdia.immatriculationservice.entities;

import com.sdia.immatriculationservice.models.Infraction;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Proprietaire {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "proprietaire", fetch = FetchType.EAGER) /** dans la classe Vehicule , elle doit avoir un attribut Proprietaire proprietaire **/
    private Collection<Vehicule> vehicules;

    /**entité etrangere qui se trouve dans le package models**/

    @Override
    public String toString() {
        return "Proprietaire{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
