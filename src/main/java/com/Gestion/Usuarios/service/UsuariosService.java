package com.Gestion.Usuarios.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestion.Usuarios.model.Usuarios;
import com.Gestion.Usuarios.repository.UsuariosRepository;

@Service
public class UsuariosService {
    @Autowired
    private UsuariosRepository usuariosRepository;

    public Usuarios guardar(Usuarios usuario){
        return usuariosRepository.create(usuario);
    }

    public List<Usuarios> listarUsuarios(){
        return usuariosRepository.readAll();
    }

    public Usuarios buscarID(int id){
        return usuariosRepository.read(id);
    }

    public Usuarios modificar(int id, Usuarios usuariomod){
        return usuariosRepository.update(id, usuariomod);
    }

    public String eliminar(int id){
        usuariosRepository.delete(id);
        return "Usuario eliminado exitosamente";
    }

    public Usuarios buscarrut(String rut){
       return usuariosRepository.readbyRut(rut);
    }
}