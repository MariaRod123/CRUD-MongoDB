package com.example.pruebaCrud.interfaces;

import com.example.pruebaCrud.model.Mascota;
import java.util.Optional;

public interface IMascota {

    //crear mascota
    Mascota saveMascota(Mascota mascota);

    //Buscar mascota por id
    Optional<Mascota>findById(Integer id);

    //Buscar mascota por nombre
    Optional<Mascota>findByNombre(String nombre);

    //Listar todas las mascotas
    Iterable<Mascota>findAllMascotas();

    //Eliminar una mascota por id
    void deleteMascotaById(Integer id);


}
