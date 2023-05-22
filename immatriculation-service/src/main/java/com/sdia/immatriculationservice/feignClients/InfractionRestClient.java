package com.sdia.immatriculationservice.feignClients;

import com.sdia.immatriculationservice.models.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="INFRACTION-SERVICE")
public interface InfractionRestClient {

    @GetMapping (path="/infractions/{id}")
    Infraction getCustomerById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/infractions")
//    PagedModel<Product> pageProducts (@RequestParam(name="page") int page, @RequestParam(name= "size") int size);
    PagedModel<Infraction> pageInfractions();
}
