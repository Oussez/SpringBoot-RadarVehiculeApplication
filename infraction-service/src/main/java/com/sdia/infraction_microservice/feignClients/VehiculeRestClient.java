package com.sdia.infraction_microservice.feignClients;

import com.sdia.infraction_microservice.models.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="IMMATRICULATION-SERVICE")
public interface VehiculeRestClient {

    @GetMapping (path="/vehicules/{id}")
    Vehicule getVehiculeById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/vehicules")
//    PagedModel<Product> pageProducts (@RequestParam(name="page") int page, @RequestParam(name= "size") int size);
    PagedModel<Vehicule> pageVehicules();
}
