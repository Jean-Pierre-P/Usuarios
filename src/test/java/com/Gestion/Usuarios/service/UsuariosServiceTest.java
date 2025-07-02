package com.Gestion.Usuarios.service;

import com.Gestion.Usuarios.model.Usuarios;
import com.Gestion.Usuarios.repository.UsuariosRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UsuariosServiceTest {

    @Mock
    private UsuariosRepository usuariosRepository;

    @InjectMocks
    private UsuariosService usuariosService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGuardar() {
        Usuarios usuario = new Usuarios(1, "12345678-9", "Juan", "Pérez", 30);
        when(usuariosRepository.create(usuario)).thenReturn(usuario);
        Usuarios resultado = usuariosService.guardar(usuario);
        assertEquals(usuario, resultado);
    }

    @Test
    void testListarUsuarios() {
        List<Usuarios> lista = Arrays.asList(new Usuarios(1, "12345678-9", "Juan", "Pérez", 30));
        when(usuariosRepository.readAll()).thenReturn(lista);
        List<Usuarios> resultado = usuariosService.listarUsuarios();
        assertEquals(1, resultado.size());
    }

    @Test
    void testBuscarID() {
        Usuarios usuario = new Usuarios(1, "12345678-9", "Juan", "Pérez", 30);
        when(usuariosRepository.read(1)).thenReturn(usuario);
        Usuarios resultado = usuariosService.buscarID(1);
        assertEquals(usuario, resultado);
    }

    @Test
    void testModificar() {
        Usuarios usuario = new Usuarios(1, "12345678-9", "Juan", "Pérez", 30);
        when(usuariosRepository.update(eq(1), any(Usuarios.class))).thenReturn(usuario);
        Usuarios resultado = usuariosService.modificar(1, usuario);
        assertEquals(usuario, resultado);
    }

    @Test
    void testEliminar() {
        String resultado = usuariosService.eliminar(1);
        assertEquals("Usuario eliminado exitosamente", resultado);
        verify(usuariosRepository).delete(1);
    }

    @Test
    void testBuscarRut() {
        Usuarios usuario = new Usuarios(1, "12345678-9", "Juan", "Pérez", 30);
        when(usuariosRepository.readbyRut("12345678-9")).thenReturn(usuario);
        Usuarios resultado = usuariosService.buscarrut("12345678-9");
        assertEquals(usuario, resultado);
    }
}
