package com.sdia.immatriculationservice.grpc;

import com.sdia.immatriculationservice.Mapper.ProprietaireMapper;
import com.sdia.immatriculationservice.grpc.services.ProprietaireService;
import com.sdia.immatriculationservice.grpc.stubs.ProprietaireServicesGrpc;
import com.sdia.immatriculationservice.repositories.ProprietaireRepository;
import com.sdia.immatriculationservice.repositories.VehiculeRepository;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
@Configuration
public class GrpcServer {

    @Autowired
    private ProprietaireRepository proprietaireRepository;
    @Autowired
    private VehiculeRepository vehiculeRepository;

    @Autowired
    private ProprietaireMapper proprietaireMapper;

    @Bean
    public ProprietaireService grpcproprietaireService() {
        return new ProprietaireService(proprietaireRepository, proprietaireMapper, vehiculeRepository);
    }

    @Bean
    public Server grpcServerX(ProprietaireService proprietaireService) {
        return ServerBuilder.forPort(6666)
                .addService(proprietaireService)
                .build();
    }

}
