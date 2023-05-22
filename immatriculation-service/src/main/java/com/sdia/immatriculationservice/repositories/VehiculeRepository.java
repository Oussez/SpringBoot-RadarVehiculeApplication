package com.sdia.immatriculationservice.repositories;

import com.sdia.immatriculationservice.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource

public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {

    public Collection<Vehicule> getVehiculeByProprietaireId(long id);

    @Query("SELECT v FROM Vehicule v WHERE v.id LIKE ?1")
    Vehicule selectById(Long id);

    @Query("SELECT v.proprietaire.id FROM Vehicule v WHERE v.id LIKE ?1")
    long selectProprietaireByIdVehicule(long id);
}
