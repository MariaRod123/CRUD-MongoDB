package com.example.pruebaCrud.controller;

import com.example.pruebaCrud.model.Mascota;
import com.example.pruebaCrud.services.MascotaServiceImpl;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class MascotaController {
    @Autowired
     MascotaServiceImpl service;


    @PostMapping("/mascotas")  //crear nueva mascota
    public Mascota saveMascota(@RequestBody Mascota mascota) {
        return service.saveMascota(mascota);
    }

    @GetMapping("/mascotas/{id}")  //buscar por id a una mascota
    public Optional<Mascota> findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @GetMapping("/mascotas/buscar/{nombre}")  //buscar por nombre a una mascota
    public Optional<Mascota> findByNombre(@PathVariable("nombre") String nombre) {
        return service.findByNombre(nombre);
    }

    @GetMapping("/mascotas/todas")  //listar todas las mascotas
    public Iterable<Mascota> findAllMascotas() {
        return service.findAllMascotas();
    }

    @DeleteMapping("/mascotas/borrar/{id}") // borrar mascota por id
    public void deleteMascotaById(@PathVariable("id") Integer id) {
        service.deleteMascotaById(id);
    }

    @PutMapping("/mascotas/modificar/{id}") //modificar  los datos de la mascota según la busco por id (en este caso es para modificar todos)
    public Mascota modificarMascota(@PathVariable("id") Integer id, @RequestBody Mascota mascota) {
        Optional<Mascota> mascotaActualizada = service.findById(id);

        mascotaActualizada.get().setNombre(mascota.getNombre());
        mascotaActualizada.get().setRaza(mascota.getRaza());
        mascotaActualizada.get().setEdad(mascota.getEdad());
        mascotaActualizada.get().setSexo(mascota.getSexo());
        mascotaActualizada.get().setTipo(mascota.getTipo());

        return service.saveMascota(mascotaActualizada.get()); 
    }

}
