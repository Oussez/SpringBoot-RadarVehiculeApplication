package com.sdia.immatriculationservice.controllers.graphQLControllers;


import com.sdia.immatriculationservice.repositories.VehiculeRepository;
import com.sdia.immatriculationservice.entities.Vehicule;
import lombok.AllArgsConstructor;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class VehiculeQLController {

    private VehiculeRepository vehiculeRepository;
    @QueryMapping
    public List<Vehicule> getAllVehicules(){
       return vehiculeRepository.findAll();
    }

    @QueryMapping
    public Vehicule getVehiculeById(@Argument long id){
        return vehiculeRepository.findById(id).get();
    }

    @MutationMapping
    public Vehicule saveVehicule(@Argument Vehicule vehicule){
            return vehiculeRepository.save(vehicule);

    }

    @MutationMapping
    public Vehicule updateVehicule(@Argument Vehicule vehicule, @Argument long id){
        vehicule.setId(id);
        return vehiculeRepository.save(vehicule);

    }

    @MutationMapping
    public String deleteVehicule(@Argument long id){
        if(vehiculeRepository.selectById(id) == null) //selectById is new method defined in Repository interface !
            return "Vehicule [ id : "+id+" ] doesn't exist ! Please check the ID entered";
        vehiculeRepository.deleteById(id);
        return "Vehicule [ id : "+id+" ] has been deleted !";


    }

}
