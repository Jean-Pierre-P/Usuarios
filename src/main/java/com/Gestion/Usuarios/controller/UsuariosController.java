package com.Gestion.Usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Usuarios getById(@PathVariable int id) {
        return usuariosService.buscarID(id);
    }

    @PutMapping("/{id}")
    public Usuarios actualizarUsuario(@PathVariable int id, @RequestBody Usuarios usuarioActualizado) {
        return usuariosService.modificar(id, usuarioActualizado);
    }

    @DeleteMapping("/{id}")
    public String eliminarUsuario(@PathVariable int id) {
        return usuariosService.eliminar(id);
    }

    @PostMapping
    public Usuarios guardarUsuario(@RequestBody Usuarios usuario) {
    return usuariosService.guardar(usuario);
    }

}
