package com.sdia.infraction_microservice.repositories;

import com.sdia.infraction_microservice.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InfractionRepository extends JpaRepository<Infraction,Long> {
    @Query("SELECT v FROM Infraction v WHERE v.id LIKE ?1")
    Infraction selectById(Long id);
}
