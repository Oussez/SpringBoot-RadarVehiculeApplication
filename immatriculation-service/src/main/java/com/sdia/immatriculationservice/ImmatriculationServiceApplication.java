package com.sdia.immatriculationservice;

import com.sdia.immatriculationservice.entities.Proprietaire;
import com.sdia.immatriculationservice.entities.Vehicule;
import com.sdia.immatriculationservice.feignClients.InfractionRestClient;
import com.sdia.immatriculationservice.repositories.ProprietaireRepository;
import com.sdia.immatriculationservice.repositories.VehiculeRepository;
//import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients /**Pour Activer le service FeignClients **/
/**pour acceder à la page web via gateway: localhost:8085/IMMATRICULATION-SERVICE/api/vehicules **/

public class ImmatriculationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationServiceApplication.class, args);
    }
//    public void run(String... args) throws Exception {
//        InfractionRestClient customerRestClient;
//        Infraction customer = customerRestClient.getCustomerById(5L);
//        customer.toString();
//    }

    @Bean
    CommandLineRunner start(ProprietaireRepository proprietaireRepository,
                            VehiculeRepository vehiculeRepository,
                            InfractionRestClient infractionRestClient){
        return args -> {
//            Infraction customer = customerRestClient.getCustomerById(5L); //5L pour une valeur Long
            /**Creating Entities of type : Propretaire**/

            for(int i=0;i<3;i++) {
                Proprietaire proprietaire = Proprietaire.builder()
                        .id(null)
                        .vehicules(null)
                        .email("proprietaire_"+i+"@gmail.com")
                        .nom("Proprietaire_"+i)
                        .build();
                /**INSERTING**/
                proprietaireRepository.save(proprietaire);
            }
            /**Creating Entities of type : Vehicule**/
            List<Proprietaire> listProprietaire = proprietaireRepository.findAll();
            listProprietaire.forEach(proprietaire -> {
                Vehicule vehicule = Vehicule.builder()
                        .proprietaire(proprietaire)
                        .infraction(null)
                        .infractionID(null)
                        .marque("marque_"+proprietaire.getId())
                        .modele("marque_"+proprietaire.getId())
                        .numMatricule("AZ"+new Random().nextInt(10000))
                        .puissanceFiscale(new Random().nextInt(50))
                        .id(null)
                        .build();
                vehiculeRepository.save(vehicule);
            });
            /**Selecting all vehicules **/

            vehiculeRepository.findAll().forEach(vehicule -> {
                System.out.println(vehicule.toString());
            });
            System.out.println("idProp: "+vehiculeRepository.selectProprietaireByIdVehicule(1));

             };

    }
    @Bean
    public CommandLineRunner grpcServerRunner(Server grpcServerX) {
        return args -> {
            grpcServerX.start();
            grpcServerX.awaitTermination();
        };
    }

    /** Syntaxe de CommandLineRunner
     CommandLineRunner start(ProprietaireRepository billRepository,
     VehiculeRepository productItemRepository,
     InfractionRestClient customerRestClient,
     ProductRestClient productRestClient){

     return args -> {
     Appeler des méthodes ici !; };
     }
     */

}
