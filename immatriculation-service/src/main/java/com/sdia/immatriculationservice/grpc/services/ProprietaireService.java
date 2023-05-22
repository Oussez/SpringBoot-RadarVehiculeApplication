package com.sdia.immatriculationservice.grpc.services;

import com.sdia.immatriculationservice.Mapper.ProprietaireMapper;
import com.sdia.immatriculationservice.entities.Proprietaire;
import com.sdia.immatriculationservice.grpc.stubs.ProprietaireServicesGrpc;
import com.sdia.immatriculationservice.grpc.stubs.ProprietaireX;
import com.sdia.immatriculationservice.repositories.ProprietaireRepository;
import com.sdia.immatriculationservice.repositories.VehiculeRepository;
import io.grpc.stub.StreamObserver;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
//@Configuration
//@ComponentScan(basePackages = "com.sdia.immatriculationservice")
public class ProprietaireService extends ProprietaireServicesGrpc.ProprietaireServicesImplBase {


    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;

    private ProprietaireMapper proprietaireMapper;

    public ProprietaireService(ProprietaireRepository proprietaireRepository, ProprietaireMapper proprietaireMapper, VehiculeRepository vehiculeRepository) {
        this.proprietaireMapper = proprietaireMapper;
        this.proprietaireRepository = proprietaireRepository;
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public void getProprietairesList(ProprietaireX.Empty empty, StreamObserver<ProprietaireX.ListProprietaire> responseObserver) {
        List<Proprietaire> Lproprietaires=proprietaireRepository.findAll();
        System.out.println(">>>> "+Lproprietaires.size());
        /**Conversion de Lproprietaires vers le type ProprietreX.Proprietaire**/
        List<ProprietaireX.Proprietaire> grpcList= Lproprietaires.stream().map(element -> proprietaireMapper.fromProprietaire(element)).collect(Collectors.toList());

        ProprietaireX.ListProprietaire ListProp= ProprietaireX.ListProprietaire.newBuilder()
                .addAllProprietaire(grpcList)
                .build();
        responseObserver.onNext(ListProp);
        responseObserver.onCompleted();
    }

    @Override
    public void getProprietaireById(ProprietaireX.ProprietaireByIdRequest request, StreamObserver<ProprietaireX.Proprietaire> responseObserver) {
        Long proprID = request.getId();
        Proprietaire proprietaire=proprietaireRepository.findById(proprID).orElseThrow(null);
        if(proprietaire!=null){
            ProprietaireX.Proprietaire proprietaireResponse= ProprietaireX.Proprietaire.newBuilder()
                    .setId(proprietaire.getId())
                    .setName(proprietaire.getNom())
                    .setEmail(proprietaire.getEmail())
                    .build();
            responseObserver.onNext(proprietaireResponse);
            responseObserver.onCompleted();
        }
    }
    @Override
    public void getAlo(ProprietaireX.Empty request, StreamObserver<ProprietaireX.Alo> responseObserver) {
        ProprietaireX.Alo resp = ProprietaireX.Alo.newBuilder()
                .setName("test allah")
                .build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    @Override
    public void addProprietaire(ProprietaireX.AddProprietaireRequest request, StreamObserver<ProprietaireX.Proprietaire> responseObserver) {
        /**Creation de nouveau enregistrement**/
        Proprietaire newProprietaire = new Proprietaire();
        newProprietaire.setId(null);
        newProprietaire.setNom(request.getName());
        newProprietaire.setEmail(request.getEmail());
        /**Insertion de novueau enregistrement**/
        Proprietaire proprietaireSaved = proprietaireRepository.save(newProprietaire);
        /**Creation de reponse de requete grpc**/
        ProprietaireX.Proprietaire proprietaireRequest = ProprietaireX.Proprietaire.newBuilder()
                .setId(proprietaireSaved.getId())
                .setEmail(proprietaireSaved.getEmail())
                .setName(proprietaireSaved.getNom())
                .build();
        responseObserver.onNext(proprietaireRequest);
        responseObserver.onCompleted();
    }


    @Override
    public void deleteProprietaire(ProprietaireX.ProprietaireByIdRequest request, StreamObserver<ProprietaireX.BoolDelete> responseObserver) {
        Proprietaire deletedProprietaire = proprietaireRepository.findById(request.getId()).get();
        boolean deleted = false;
        if(deletedProprietaire != null){
            System.out.println("*** deleted "+deletedProprietaire.getId());
            proprietaireRepository.delete(deletedProprietaire);
            deleted=true;
        }
        ProprietaireX.BoolDelete deleteSuccessfuly= ProprietaireX.BoolDelete.newBuilder()
                .setDelete(deleted)
                .build();
        responseObserver.onNext(deleteSuccessfuly);
        responseObserver.onCompleted();

    }

    @Override
    public void getProprietaireByVehiculeId(ProprietaireX.IdRequest request, StreamObserver<ProprietaireX.Proprietaire> responseObserver) {
        long idVehicule = request.getId();
        long idProprietaire = vehiculeRepository.selectProprietaireByIdVehicule(idVehicule);
        /**Selecting the prorieatire relevant to idProprietaire:**/
        ProprietaireX.Proprietaire proprietaireResponse = proprietaireMapper.fromProprietaire(proprietaireRepository.findById(idProprietaire).get());
        System.out.println("********* PROPRIETAIRE SENT ");
        responseObserver.onNext(proprietaireResponse);
        responseObserver.onCompleted();
    }
}

