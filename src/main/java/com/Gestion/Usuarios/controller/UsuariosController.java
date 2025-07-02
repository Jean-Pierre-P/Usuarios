package com.Gestion.Usuarios.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Gestion.Usuarios.model.Usuarios;
import com.Gestion.Usuarios.service.UsuariosService;

@RequestMapping("/api/usuarios")
@RestController
public class UsuariosController {
    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    public List<Usuarios> listaUsuarios() {
        return usuariosService.listarUsuarios();
    }
    
    @GetMapping("/{id}")
    public String getbyId(@PathVariable int id) {
        return new String();
    }
}