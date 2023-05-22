//package com.sdia.radar_microservice.grpc.services;
//
//
//import com.sdia.radar_microservice.entities.Radar;
//import com.sdia.radar_microservice.grpc.stubs.RadarRPC;
//import com.sdia.radar_microservice.grpc.stubs.RadarServicesGrpc;
//import com.sdia.radar_microservice.grpc.stubs.RadarRPC;
//import com.sdia.radar_microservice.repositories.RadarRepository;
//import io.grpc.stub.StreamObserver;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class RadarServiceX extends RadarServicesGrpc.RadarServicesImplBase {
//    private RadarRepository radarRepository;
//    //private RadarMapper radarMapper;
//
//    public RadarServiceX(RadarRepository radarRepository) {
//        this.radarRepository = radarRepository;
//    }
//
//    @Override
//    public void getAlo(RadarRPC.Empty request, StreamObserver<RadarRPC.Alo> responseObserver) {
//        RadarRPC.Alo resp = RadarRPC.Alo.newBuilder()
//                .setId(99)
//                .build();
//        responseObserver.onNext(resp);
//        responseObserver.onCompleted();
//    }
//}
