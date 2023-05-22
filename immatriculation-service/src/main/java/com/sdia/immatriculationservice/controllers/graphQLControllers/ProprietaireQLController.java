package com.sdia.immatriculationservice.controllers.graphQLControllers;


import com.sdia.immatriculationservice.entities.Proprietaire;
import com.sdia.immatriculationservice.repositories.ProprietaireRepository;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProprietaireQLController {

    private ProprietaireRepository proprietaireRepository;
    @QueryMapping
    public List<Proprietaire> getAllProprietaires(){
       return proprietaireRepository.findAll();
    }

    @QueryMapping
    public Proprietaire getProprietaireById(@Argument long id){
        return proprietaireRepository.findById(id).get();
    }

    @MutationMapping
    public Proprietaire saveProprietaire(@Argument Proprietaire prop){
            return proprietaireRepository.save(prop);

    }

    @MutationMapping
    public Proprietaire updateProprietaire(@Argument Proprietaire prop, @Argument long id){
        prop.setId(id);
        return proprietaireRepository.save(prop);

    }

    @MutationMapping
    public String deleteProprietaire(@Argument long id){
        if(proprietaireRepository.selectById(id) == null) //selectById is new method defined in Repository interface !
            return "Proprietaire [ id : "+id+" ] doesn't exist ! Please check the ID entered";
        proprietaireRepository.deleteById(id);
        return "Proprietaire [ id : "+id+" ] has been deleted !";


    }

}
