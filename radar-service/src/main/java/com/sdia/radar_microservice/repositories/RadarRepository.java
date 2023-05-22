package com.sdia.radar_microservice.repositories;

import com.sdia.radar_microservice.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RadarRepository extends JpaRepository<Radar,Long> {
    @Query("SELECT v FROM Radar v WHERE v.id LIKE ?1")
    Radar selectById(Long id);
}
