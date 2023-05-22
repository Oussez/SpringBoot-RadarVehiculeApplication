package com.sdia.radar_microservice.Mapper;


import com.sdia.radar_microservice.entities.Radar;
import com.sdia.radar_microservice.grpc.stubs.ProprietaireX;
import com.sdia.radar_microservice.grpc.stubs.RadarRPC;
import com.sdia.radar_microservice.models.Infraction;
import com.sdia.radar_microservice.models.Proprietaire;
import com.sdia.radar_microservice.models.Vehicule;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@Component
public class RadarMapper {

    public RadarRPC.Radar fromRadar(Radar radar) {
        RadarRPC.Radar.Builder builder = RadarRPC.Radar.newBuilder()
                .setId(radar.getId())
                .setVitesseMax(radar.getVitesseMax());
        if (radar.getCoordonnees().length >= 2) {
            builder.addAllCoordonnees(DoubleStream.of(radar.getCoordonnees())
                    .boxed()
                    .collect(Collectors.toList()));
        }

        return builder.build();
    }

    private RadarRPC.Infraction fromInfraction(Infraction infraction){
        /**Vehicule mapper**/
        RadarRPC.Vehicule vehiculegRPC = null;
        if(infraction != null)
             vehiculegRPC = this.fromVehicule(infraction.getVehicule());
        RadarRPC.Infraction.Builder infractiongRPC = RadarRPC.Infraction.newBuilder()
                .setId(infraction.getId())
                .setNumRadar(infraction.getNumRadar())
                .setNumMatricule(infraction.getNumMatricule())
                .setMontantFraction(infraction.getMontantFraction())
                .setVehicule(vehiculegRPC);

        return infractiongRPC.build();
    }

    private RadarRPC.Vehicule fromVehicule(Vehicule vehicule){
        /**Proprietaire mapper**/
        RadarRPC.Proprietaire proprietairegRPC = this.fromProprietaire(vehicule.getProprietaire());
        RadarRPC.Vehicule.Builder vehiculegRPC = RadarRPC.Vehicule.newBuilder()
                .setId(vehicule.getId())
                .setMarque(vehicule.getMarque())
                .setNumMatricule(vehicule.getNumMatricule())
                .setInfractionID(vehicule.getInfractionID())
                .setMarque(vehicule.getMarque())
                .setModele(vehicule.getModele())
                .setProprietaire(proprietairegRPC);

                return vehiculegRPC.build();
    }

    public RadarRPC.Proprietaire fromProprietaire(Proprietaire owner) {
        RadarRPC.Proprietaire.Builder builder = RadarRPC.Proprietaire.newBuilder()
                .setId(owner.getId())
                .setName(owner.getNom())
                .setEmail(owner.getEmail());

        return builder.build();
    }

    public Proprietaire fromProprietaireRPC(ProprietaireX.Proprietaire owner) {
        Proprietaire proprietaire = new Proprietaire();
                proprietaire.setId(owner.getId());
                proprietaire.setNom(owner.getName());
                proprietaire.setEmail(owner.getEmail());

        return proprietaire;
    }
}
