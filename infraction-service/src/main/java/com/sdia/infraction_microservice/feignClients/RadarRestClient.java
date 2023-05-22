package com.sdia.infraction_microservice.feignClients;

import com.sdia.infraction_microservice.models.Radar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="RADAR-SERVICE")
public interface RadarRestClient {

    @GetMapping (path="/radars/{id}")
    Radar getRadarById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/radars")
//    PagedModel<Product> pageProducts (@RequestParam(name="page") int page, @RequestParam(name= "size") int size);
    PagedModel<Radar> pageRadars();
}
