package com.sdia.radar_microservice.feignClients;

import com.sdia.radar_microservice.models.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="INFRACTION-SERVICE")
public interface InfractionRestClient {

    @GetMapping (path="/infractions/{id}")
    Infraction getInfractionById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/infractions")
//    PagedModel<Product> pageProducts (@RequestParam(name="page") int page, @RequestParam(name= "size") int size);
    PagedModel<Infraction> pageInfractions();

    @PostMapping(path = "/infractions")
    Infraction saveInfraction(@RequestBody Infraction infraction);
}
