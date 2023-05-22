package com.sdia.immatriculationservice.repositories;

import com.sdia.immatriculationservice.entities.Proprietaire;
import com.sdia.immatriculationservice.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProprietaireRepository extends JpaRepository<Proprietaire,Long> {

    //public Collection<Proprietaire> getBillByCustomerId(long id);
    @Query("SELECT v FROM Vehicule v WHERE v.id LIKE ?1")
    Vehicule selectById(long id);
}
