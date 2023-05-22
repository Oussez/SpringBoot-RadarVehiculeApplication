package com.sdia.radar_microservice.grpc.services;

import com.sdia.radar_microservice.Mapper.RadarMapper;
import com.sdia.radar_microservice.entities.Radar;
import com.sdia.radar_microservice.grpc.stubs.RadarServicesGrpc;
import com.sdia.radar_microservice.grpc.stubs.RadarRPC;
import com.sdia.radar_microservice.repositories.RadarRepository;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.stream.Collectors;

public class RadarService extends RadarServicesGrpc.RadarServicesImplBase {
    private RadarRepository radarRepository;
    private RadarMapper radarMapper;

    public RadarService(RadarRepository radarRepository, RadarMapper radarMapper) {
        this.radarRepository = radarRepository;
        this.radarMapper = radarMapper;
    }

    @Override
    public void getRadarList(RadarRPC.Empty request, StreamObserver<RadarRPC.ListRadar> responseObserver) {

        List<Radar> Lradars=radarRepository.findAll();
        System.out.println(">>>> Total Radars : "+Lradars.size());
        /**Conversion de Lradars vers le type RadarRPC.Radar**/
        List<RadarRPC.Radar> grpcList= Lradars.stream().map(element -> radarMapper.fromRadar(element)).collect(Collectors.toList());

        RadarRPC.ListRadar ListProp= RadarRPC.ListRadar.newBuilder()
                .addAllRadar(grpcList)
                .build();
        responseObserver.onNext(ListProp);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteRadar(RadarRPC.IdRequest request, StreamObserver<RadarRPC.BoolDelete> responseObserver) {
        Radar deletedRadar = radarRepository.findById(request.getId()).get();
        boolean deleted = false;
        if (deletedRadar != null) {
            System.out.println("*** deleted " + deletedRadar.getId());
            radarRepository.delete(deletedRadar);
            deleted = true;
        }
        RadarRPC.BoolDelete deleteSuccessfuly = RadarRPC.BoolDelete.newBuilder()
                .setDelete(deleted)
                .build();
        responseObserver.onNext(deleteSuccessfuly);
        responseObserver.onCompleted();

    }

}
