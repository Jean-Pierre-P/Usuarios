package com.Gestion.Usuarios.controller;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.Gestion.Usuarios.model.Usuarios;
import com.Gestion.Usuarios.service.UsuariosService;

public class UsuariosControllerTest {

    @Mock
    private UsuariosService usuariosService;

    @InjectMocks
    private UsuariosController usuariosController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testListaUsuarios() {
        List<Usuarios> lista = Arrays.asList(new Usuarios(1, "12345678-9", "Juan", "Pérez", 30));
        when(usuariosService.listarUsuarios()).thenReturn(lista);
        List<Usuarios> resultado = usuariosController.listaUsuarios();
        assertEquals(1, resultado.size());
        assertEquals("Juan", resultado.get(0).getName());
    }
}
