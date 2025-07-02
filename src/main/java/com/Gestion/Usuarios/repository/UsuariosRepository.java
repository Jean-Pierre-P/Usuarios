package com.Gestion.Usuarios.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.Gestion.Usuarios.model.Usuarios;

@Repository
public class UsuariosRepository {
    private List<Usuarios> usuarios=new ArrayList<>();

    public List<Usuarios> readAll(){
        return usuarios;
    }

    public Usuarios create(Usuarios usuar){
        usuarios.add(usuar);
        System.out.println(usuarios.toString());
        return usuar;
    }

    public Usuarios read(int id){   
        for (Usuarios usuar : usuarios){
            if (usuar.getId()==id) {
                return usuar;
            }
        }
        return null;
    }

    public Usuarios update(int id, Usuarios usuariomod)
    {
        Usuarios p=read(id);
        if(p!=null)
        {
            p.setName(usuariomod.getName());
            p.setApellido(usuariomod.getApellido());
            p.setEdad(usuariomod.getEdad());
            return p;
        }
        return null;
    }

    public String delete(int id){
        Usuarios matar=read(id);
        if(matar!=null){
            usuarios.remove(matar);
        }
        return null;
    }

    public Usuarios readbyRut(String rut) {
        for (Usuarios u : usuarios) {
            if(u.getRut().equals(rut)){
                return u;
            }
        }
        return null;
    }
}

