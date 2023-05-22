package com.sdia.immatriculationservice.Mapper;

import com.sdia.immatriculationservice.entities.Proprietaire;
import com.sdia.immatriculationservice.grpc.stubs.ProprietaireX;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.sdia.immatriculationservice.entities.Proprietaire;
import com.sdia.immatriculationservice.grpc.stubs.ProprietaireX;
import org.springframework.stereotype.Component;

@Component
public class ProprietaireMapper {

    public ProprietaireX.Proprietaire fromProprietaire(Proprietaire owner) {
        ProprietaireX.Proprietaire.Builder builder = ProprietaireX.Proprietaire.newBuilder()
                .setId(owner.getId())
                .setName(owner.getNom())
                .setEmail(owner.getEmail());

        return builder.build();
    }

    public Proprietaire fromGrpcProprietaire(ProprietaireX.Proprietaire grpcProprietaire) {
        Proprietaire proprietaire = new Proprietaire();
        proprietaire.setId(grpcProprietaire.getId());
        proprietaire.setNom(grpcProprietaire.getName());
        proprietaire.setEmail(grpcProprietaire.getEmail());

        return proprietaire;
    }
}
