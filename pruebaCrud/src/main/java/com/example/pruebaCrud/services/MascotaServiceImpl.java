package com.example.pruebaCrud.services;

import com.example.pruebaCrud.model.Mascota;
import com.example.pruebaCrud.repository.MascotaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaServiceImpl {
    @Autowired
    MascotaRepository repository;


    // Se implementan los métodos que están definidos en la interfaz IMascota


    public Mascota saveMascota(Mascota mascota) {
        return repository.save(mascota);
    }


    public Optional<Mascota> findById(Integer id) {
        return repository.findById(id);
    }

    public Optional<Mascota> findByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }


    public Iterable<Mascota> findAllMascotas() {
        return repository.findAll();
    }


    public void deleteMascotaById(Integer id) {
        repository.deleteById(id);
    }


}
