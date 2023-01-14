package com.example.pruebaCrud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mascotas") //nombre de la colleccion
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mascota {


    // creacion de los campos del documento para la colección mascotas
    @Id
    private Integer id;
    private String nombre;
    private String raza;
    private String edad;
    private String sexo;
    private String tipo;


}
