package com.sdia.radar_microservice.grpc;




import com.sdia.radar_microservice.Mapper.RadarMapper;
import com.sdia.radar_microservice.grpc.services.RadarService;
import com.sdia.radar_microservice.repositories.RadarRepository;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServer {

    @Autowired
    private RadarRepository radarRepository;

    @Autowired
    private RadarMapper radarMapper;

    @Bean
    public RadarService grpcradarService() {
        return new RadarService(radarRepository, radarMapper);
    }

    @Bean
    public Server grpcServerX(RadarService radarService) {
        System.out.println("*** Server gRPC is RUNNING ...");
        return ServerBuilder.forPort(5555)
                .addService(radarService)
                .build();
    }

}
