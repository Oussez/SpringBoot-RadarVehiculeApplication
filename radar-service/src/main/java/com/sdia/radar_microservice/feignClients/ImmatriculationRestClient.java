package com.sdia.radar_microservice.feignClients;

import com.sdia.radar_microservice.models.Proprietaire;
import com.sdia.radar_microservice.models.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="IMMATRICULATION-SERVICE")
public interface ImmatriculationRestClient {

    @GetMapping (path="/proprietaires/{id}")
    Proprietaire getProprietaireById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/proprietaires")
//    PagedModel<Product> pageProducts (@RequestParam(name="page") int page, @RequestParam(name= "size") int size);
    PagedModel<Proprietaire> pageProprietaires();

    @GetMapping (path="/api/vehicules/{id}")
    Vehicule getVehiculeById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/vehicules")
//    PagedModel<Product> pageProducts (@RequestParam(name="page") int page, @RequestParam(name= "size") int size);
    PagedModel<Vehicule> pageVehicules();
}
