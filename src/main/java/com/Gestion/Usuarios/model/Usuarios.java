package com.Gestion.Usuarios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Usuarios {
    private int id;
    private String rut;
    private String name;
    private String apellido;
    private int edad;
}
