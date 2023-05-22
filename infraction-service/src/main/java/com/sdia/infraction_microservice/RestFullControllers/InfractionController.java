package com.sdia.infraction_microservice.RestFullControllers;


import com.sdia.infraction_microservice.entities.Infraction;
import com.sdia.infraction_microservice.repositories.InfractionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")  //declarer le root de URL

public class InfractionController {
    //Declaration d'objet repository
    @Autowired
    InfractionRepository infractionRepository;

    //select method :
    /** remarque : ("/enetityA+s) -> Ex : "/infractions" , "infractions"**/
    @GetMapping("/infractions")
    public List<Infraction> getAllInfractions(){
        return infractionRepository.findAll();
    }

    @GetMapping("/infractions/{id}")
    public Infraction getOneInfraction(@PathVariable long id){
        return infractionRepository.findById(id).get();
    }


    //Insert method :
    @PostMapping("/infractions")
    public Infraction saveInfraction(@RequestBody Infraction infraction){
        System.out.println(">> [Inserting Infraction] : "+infraction.toString());
        return infractionRepository.save(infraction);
    }


    //Update method :
    @PutMapping("/infractions/{id}")
    public Infraction updateInfraction(@RequestBody Infraction infraction, @PathVariable long id){
        //PathVariable signifie que le para id se trouve dans URL request http
        //RequestBody signifie que l'objet infraction se trouve dans le corps de request http

        infraction.setId(id); //l'objet infraction chargé dans la requet est déja modifié il faut juste l'inserer dans bdd.
        return infractionRepository.save(infraction);
    }

    //Delete method :
    @DeleteMapping("/infractions/{id}")
    public void deleteInfraction(@PathVariable long id){
        //PathVariable signifie que le para id se trouve dans URL request http
        //RequestBody signifie que l'objet infraction se trouve dans le corps de request http

        infractionRepository.deleteById(id);
        System.out.println(">> [Deleting Infraction]: Infraction [ID = "+id+" ] has been deleted successfuly !");
    }


    @GetMapping("/AA")
    public String getsA(){
        return "<h3><b>hola</b></h3>"+
                "\n <h1>Welcome to my Infraction Micro-service</h1>";
    }
}
