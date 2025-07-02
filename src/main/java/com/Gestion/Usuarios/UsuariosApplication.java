package com.Gestion.Usuarios;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.Gestion.Usuarios.model.Usuarios;
import com.Gestion.Usuarios.service.UsuariosService;


@SpringBootApplication
public class UsuariosApplication {

    private final UsuariosService usuariosService;

    UsuariosApplication(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
	}

	@GetMapping("/{id}")
    public Usuarios getbyId(@PathVariable int id){
        return usuariosService.buscarID(id);
    }
    
    @GetMapping("/rut={rut}")
    public Usuarios getbyRut(@PathVariable String rut){
        return usuariosService.buscarrut(rut);
    }

    @PostMapping
    public Usuarios crearPersona(@RequestBody Usuarios persona){
        return usuariosService.guardar(persona);
    }

    @PutMapping("/{id}")
    public Usuarios putMethodName(@PathVariable int id, @RequestBody Usuarios usuarmod){
        return usuariosService.modificar(id, usuarmod);
    }

    @DeleteMapping("/{id}")
    public String deletePersona(@PathVariable int id){
        return usuariosService.eliminar(id);
    }
}
