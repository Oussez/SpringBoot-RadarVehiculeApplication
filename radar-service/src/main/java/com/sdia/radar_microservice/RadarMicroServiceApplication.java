package com.sdia.radar_microservice;

import com.sdia.radar_microservice.Mapper.RadarMapper;
import com.sdia.radar_microservice.RestFullControllers.RadarController;
import com.sdia.radar_microservice.entities.Radar;
import com.sdia.radar_microservice.feignClients.ImmatriculationRestClient;
import com.sdia.radar_microservice.feignClients.InfractionRestClient;
import com.sdia.radar_microservice.grpc.stubs.ProprietaireServicesGrpc;
import com.sdia.radar_microservice.grpc.stubs.ProprietaireX;
import com.sdia.radar_microservice.models.Infraction;
import com.sdia.radar_microservice.models.Proprietaire;
import com.sdia.radar_microservice.models.Vehicule;
import com.sdia.radar_microservice.repositories.RadarRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.hateoas.PagedModel;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

@SpringBootApplication
@EnableFeignClients
public class RadarMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadarMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(InfractionRestClient infractionRestClient,RadarRepository radarRepository, RepositoryRestConfiguration repositoryRestConfiguration){
        repositoryRestConfiguration.exposeIdsFor(Radar.class);
        return args -> {
            PagedModel<Infraction> listInfra = infractionRestClient.pageInfractions();
            double [] coor = {121.2, 99.2};
            listInfra.forEach(infraction -> {
                List<Long> infractionIds = new ArrayList<>();
                infractionIds.add(infraction.getId());
                radarRepository.save(new Radar(null,150, coor ,infractionIds));
            });
//           System.out.println("============= *** SELECT ALL INFRACTIONS *** ===============");
//            radarRepository.findAll().forEach(radar -> {
//                System.out.println(radar.toString());
//            });
        };
    }

    /**Dans cette application grpcClient, on va effectuer 2 actions:
     //     * 1) Appeler le micro-service Immatriculation-service pour recuperer les données d'un proprietaire d'une vehicule
                 depassant la vitesse maximale basant sur grpc webservice.

     //     * 2) Appler le micro-service Infraction-service pour enregistrer une nouvelle infraction afféctée à le proprietaire récent
     //     */
    @Bean
    public CommandLineRunner grpcClient(RadarController radarController,RadarRepository radarRepository, InfractionRestClient infractionRestClient, ImmatriculationRestClient immatriculationRestClient) {
        return args -> {
            System.out.println("***** Communication between Radar-service & Infraction-service & Immtariculation-service *****");
            //Declarer un canal de communication
            ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",6666)
                    .usePlaintext()
                    .build();

            ProprietaireServicesGrpc.ProprietaireServicesBlockingStub blockingStub = ProprietaireServicesGrpc.newBlockingStub(managedChannel); //communication bloquante que pour le cas UNARY MODEL
            /**( 1 )  **/
            //Creation de radar
            double [] coor = {new Random().nextDouble(10000), new Random().nextDouble(1000)};
            Scanner scanner = new Scanner(System.in);
            System.out.println(">> Please write the max speed of radar : ");
            double viteseMax = scanner.nextDouble();
            Radar radar = new Radar(null,viteseMax,coor,new ArrayList<>());
            Radar savedRadar = radarRepository.save(radar);
            //Selection d'une vehicule qui dépasse la vitesseMax de Radar
            System.out.println("**** RADAR IS TRYING TO FIND ANY VEHICULE SURPASS THE MAX SPEED "+viteseMax+" km/h .... ");
            Vehicule wantedVehicule = immatriculationRestClient.getVehiculeById(new Random().nextLong(1,4));
            System.out.println(wantedVehicule);

            //Initialisation de message requete
            ProprietaireX.IdRequest idRequest = ProprietaireX.IdRequest.newBuilder()
                    .setId(wantedVehicule.getId())
                    .build();

            ProprietaireX.Proprietaire proprietaireResponse = blockingStub.getProprietaireByVehiculeId(idRequest);
            /**Mapping ProprietairegRPC to Proprietaire **/
            Proprietaire proprietaire = new RadarMapper().fromProprietaireRPC(proprietaireResponse);

            /** ( 2 ) **/
            Infraction infraction = new Infraction();
            infraction.setId(null);
            infraction.setRadar(radar);
            infraction.setNumRadar(radar.getId());
            infraction.setDate(new Date());
            infraction.setNumMatricule(wantedVehicule.getNumMatricule());
            infraction.setVehicule(wantedVehicule); //to be added ( select vehicule using openfein vehicule
            infraction.setMontantFraction(new Random().nextDouble(500));
            infraction.setVitesseVehicule(new Random().nextDouble(viteseMax+5, viteseMax+50));
            Infraction infraction1 = infractionRestClient.saveInfraction(infraction);
            // Ajouter cette nouvelle infraction a le radar courant
            List<Long> ListIdInfraction = new ArrayList<>();
            ListIdInfraction.add(infraction1.getId());
            savedRadar.setListIdInfraction(ListIdInfraction);
            radarController.updateRadar(radar, savedRadar.getId());
            System.out.println(">> WANTED PROPRIETAIRE: "+proprietaire);
            System.out.println(">> savedRadar: ,"+savedRadar);
            System.out.println(">> savedInfraction : "+infraction1);

        };
    }

    @Bean
    public CommandLineRunner grpcServerRunner(Server grpcServerX) {
        return args -> {
            grpcServerX.start();
            grpcServerX.awaitTermination();

        };
    }
}
