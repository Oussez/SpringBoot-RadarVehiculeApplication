package com.sdia.infraction_microservice;

import com.sdia.infraction_microservice.entities.Infraction;
import com.sdia.infraction_microservice.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class InfractionMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfractionMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(InfractionRepository infractionRepository, RepositoryRestConfiguration repositoryRestConfiguration){
        repositoryRestConfiguration.exposeIdsFor(Infraction.class);
        return args -> {
            infractionRepository.save(new Infraction(new Date(),150,500, null, null));
            infractionRepository.save(new Infraction(new Date(),100,300, null, null));
            System.out.println("============= *** SELECT ALL INFRACTIONS *** ===============");
            infractionRepository.findAll().forEach(infraction -> {
                System.out.println(infraction.toString());
            });
        };
    }

}
