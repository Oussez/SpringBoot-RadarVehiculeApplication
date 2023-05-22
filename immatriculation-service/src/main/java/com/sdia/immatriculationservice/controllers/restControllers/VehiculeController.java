package com.sdia.immatriculationservice.controllers.restControllers;


import com.sdia.immatriculationservice.entities.Vehicule;
import com.sdia.immatriculationservice.repositories.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")  //declarer le root de URL

public class VehiculeController {
    //Declaration d'objet repository
    @Autowired
    VehiculeRepository vehiculeRepository;

    //select method :
    /** remarque : ("/enetityA+s) -> Ex : "/vehicules" , "vehicules"**/
    @GetMapping("/vehicules")
    public List<Vehicule> getAllAccounts(){
        return vehiculeRepository.findAll();
    }

    @GetMapping("/vehicules/{id}")
    public Vehicule getOneAccount(@PathVariable long id){
        return vehiculeRepository.findById(id).get();
    }


    //Insert method :
    @PostMapping("/vehicules")
    public Vehicule saveAccount(@RequestBody Vehicule product){
        System.out.println(">> [Inserting Vehicule] : "+product.toString());
        return vehiculeRepository.save(product);
    }


    //Update method :
    @PutMapping("/vehicules/{id}")
    public Vehicule updateAccount(@RequestBody Vehicule product, @PathVariable long id){
        //PathVariable signifie que le para id se trouve dans URL request http
        //RequestBody signifie que l'objet product se trouve dans le corps de request http

        product.setId(id); //l'objet product chargé dans la requet est déja modifié il faut juste l'inserer dans bdd.
        return vehiculeRepository.save(product);
    }

    //Delete method :
    @DeleteMapping("/vehicules/{id}")
    public void deleteAccount(@PathVariable long id){
        //PathVariable signifie que le para id se trouve dans URL request http
        //RequestBody signifie que l'objet product se trouve dans le corps de request http

        vehiculeRepository.deleteById(id);
        System.out.println(">> [Deleting Vehicule]: Vehicule [ID = "+id+" ] has been deleted successfuly !");
    }

}
