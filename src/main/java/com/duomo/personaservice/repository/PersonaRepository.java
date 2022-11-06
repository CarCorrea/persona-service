package com.duomo.personaservice.repository;

import com.duomo.personaservice.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "personas", collectionResourceRel = "personas")
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
