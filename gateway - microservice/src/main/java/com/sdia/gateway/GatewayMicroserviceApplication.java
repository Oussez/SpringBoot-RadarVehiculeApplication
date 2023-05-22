package com.sdia.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class GatewayMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayMicroserviceApplication.class, args);
    }


    /**_________________________________________________
     //Partie de configuration gateway dans la classe___
     //c'est mieux d'utiliser application.yml___________
     //___________________________________________________**/

     /** //Methode Static en fonction de l'uri des micro-services
    //@Bean
    RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route((r)->r.path("/comptes/**").uri("http://localhost:8087/"))
                //.route((r)->r.path("/products/**").uri("http://localhost:8082/"))
                .build();
    }**/

    /**____________________________________________________

    // Methode Statique en fonction de nom des micro-services:
     @Bean
     RouteLocator routeLocator(RouteLocatorBuilder builder){
     return builder.routes()
     .route((r)->r.path("/comptes/**").uri("lb://customer-service"))
     //.route((r)->r.path("/products/**").uri("http://localhost:8082/").id("r2"))
     .build();
     }
     **/

    /**Methode dynamique : pour accéder à le micro-service dans une page web
     * http://localhost:portGateWay/nomMicroServiceEnMajuscule/...
     * Ex : localhost:8885/BANK-SERVICE/comptes
     */
    @Bean
    DiscoveryClientRouteDefinitionLocator definitionLocator(
            ReactiveDiscoveryClient rdc,
            DiscoveryLocatorProperties properties){
        return new DiscoveryClientRouteDefinitionLocator(rdc,properties);
    }
}
