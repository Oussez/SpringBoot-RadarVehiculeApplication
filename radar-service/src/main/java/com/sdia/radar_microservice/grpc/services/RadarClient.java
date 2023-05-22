//package com.sdia.radar_microservice.grpc.services;
//
//
//import com.sdia.radar_microservice.Mapper.RadarMapper;
//import com.sdia.radar_microservice.entities.Radar;
//import com.sdia.radar_microservice.feignClients.InfractionRestClient;
//import com.sdia.radar_microservice.grpc.stubs.ProprietaireServicesGrpc;
//import com.sdia.radar_microservice.grpc.stubs.ProprietaireX;
//import com.sdia.radar_microservice.grpc.stubs.RadarRPC;
//import com.sdia.radar_microservice.grpc.stubs.RadarServicesGrpc;
//import com.sdia.radar_microservice.models.Infraction;
//import com.sdia.radar_microservice.models.Proprietaire;
//import com.sdia.radar_microservice.repositories.RadarRepository;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Random;
//
//@EnableFeignClients
//@Configuration
//public class RadarClient {
//    @Autowired
//    static RadarRepository radarRepository;
//    /**                               UNARY MODEL                     **/
//    /**Dans cette application radar, on va effectuer 2 actions:
//     * 1) Appeler le micro-service Immatriculation-service pour recuper les données d'un proprietaire d'une vehicule basant sur grpc webservice
//
//     * 2) Appler le micro-service Infraction-service pour enregistrer une nouvelle infraction afféctée à le proprietaire récent
//     */
//    public static void main(String[] args) {
//        //Declarer un canal de communication
//        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",6666)
//                                        .usePlaintext()
//                                        .build();
//
//        ProprietaireServicesGrpc.ProprietaireServicesBlockingStub blockingStub = ProprietaireServicesGrpc.newBlockingStub(managedChannel); //communication bloquante que pour le cas UNARY MODEL
//        /**( 1 )  **/
//        //Initialisation de message requete
//        ProprietaireX.IdRequest idRequest = ProprietaireX.IdRequest.newBuilder()
//                .setId(1)
//                .build();
//
//        ProprietaireX.Proprietaire proprietaireResponse = blockingStub.getProprietaireByVehiculeId(idRequest);//faire appel à le service 'convert(requete_de_client)'
//        /**Mapping ProprietairegRPC to Proprietaire **/
//        Proprietaire proprietaire = new RadarMapper().fromProprietaireRPC(proprietaireResponse);
//        System.out.println(proprietaire);
//        //Creatino de radar
//        double [] coor = {new Random().nextDouble(10000), new Random().nextDouble(1000)};
//        Radar radar = new Radar(null,144,coor,new ArrayList<>());
//        Radar savedRadar = radarRepository.save(radar);
//        System.out.println(">> savedRadar: ,"+savedRadar);
//        /** ( 2 ) **/
//        InfractionRestClient infractionRestClient;
//        Infraction infraction = new Infraction();
//        infraction.setId(null);
//        infraction.setRadar(radar);
//        infraction.setNumRadar(radar.getId());
//        infraction.setDate(new Date());
//        infraction.setNumMatricule("AAS122");
//        infraction.setVehicule(null); //to be added ( select vehicule using openfein vehicule
//        infraction.setMontantFraction(new Random().nextDouble(500));
//        infraction.setVitesseVehicule(160.5);
//        infractionRestClient.saveInfraction(infraction);
//
//    }
//
//}
