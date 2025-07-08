
package com.Gestion.Usuarios.dto;

import java.util.Map;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Respuesta con enlaces HATEOAS")
public class UsuarioHATEOAS {

    @Schema(description = "ID del usuario")
    private Integer id;

    @Schema(description = "Nombre del usuario")
    private String nombre;

    @Schema(description = "Correo del usuario")
    private String correo;

    @Schema(description = "Enlaces relacionados")
    private Map<String, String> _links;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public Map<String, String> get_links() { return _links; }
    public void set_links(Map<String, String> _links) { this._links = _links; }
}
