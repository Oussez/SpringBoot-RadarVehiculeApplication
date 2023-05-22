package com.sdia.immatriculationservice.controllers.restControllers;


import com.sdia.immatriculationservice.repositories.ProprietaireRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sdia.immatriculationservice.entities.Proprietaire;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")  //declarer le root de URL

public class ProprietaireController {
    //Declaration d'objet repository
    @Autowired
    ProprietaireRepository proprietaireRepository;

    //select method :
    /** remarque : ("/enetityA+s) -> Ex : "/proprietaires" , "proprietaires"**/
    @GetMapping("/proprietaires")
    public List<Proprietaire> getAllAccounts(){
        return proprietaireRepository.findAll();
    }

    @GetMapping("/proprietaires/{id}")
    public Proprietaire getOneAccount(@PathVariable long id){
        return proprietaireRepository.findById(id).get();
    }


    //Insert method :
    @PostMapping("/proprietaires")
    public Proprietaire saveAccount(@RequestBody Proprietaire product){
        System.out.println(">> [Inserting Proprietaire] : "+product.toString());
        return proprietaireRepository.save(product);
    }


    //Update method :
    @PutMapping("/proprietaires/{id}")
    public Proprietaire updateAccount(@RequestBody Proprietaire product, @PathVariable long id){
        //PathVariable signifie que le para id se trouve dans URL request http
        //RequestBody signifie que l'objet product se trouve dans le corps de request http

        product.setId(id); //l'objet product chargé dans la requet est déja modifié il faut juste l'inserer dans bdd.
        return proprietaireRepository.save(product);
    }

    //Delete method :
    @DeleteMapping("/proprietaires/{id}")
    public void deleteAccount(@PathVariable long id){
        //PathVariable signifie que le para id se trouve dans URL request http
        //RequestBody signifie que l'objet product se trouve dans le corps de request http

        proprietaireRepository.deleteById(id);
        System.out.println(">> [Deleting Proprietaire]: Proprietaire [ID = "+id+" ] has been deleted successfuly !");
    }


    @GetMapping("/AA")
    public String getsA(){
        return "<h3><b>hola</b></h3>"+
                "\n <h1>Welcome to my Proprietaire Micro-service</h1>";
    }
}
