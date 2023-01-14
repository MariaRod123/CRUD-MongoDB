package com.example.pruebaCrud.repository;

import com.example.pruebaCrud.model.Mascota;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends MongoRepository<Mascota, Integer> {

    Optional<Mascota> findByNombre(String nombre);

}
