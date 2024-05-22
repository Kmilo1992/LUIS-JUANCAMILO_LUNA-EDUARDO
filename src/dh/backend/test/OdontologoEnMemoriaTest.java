package dh.backend.test;

import dh.backend.dao.impl.OdontologoEnMemoria;
import dh.backend.model.Odontologo;
import dh.backend.service.OdontologoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoEnMemoriaTest {
    private OdontologoService odontologoService = new OdontologoService(new OdontologoEnMemoria());

    @Test
    @DisplayName("Testear que se registra un Odontologo")
    void registrar() {
        Odontologo odontologo = new Odontologo("PEREZ", "GENARO", "TU785273");
        Odontologo odontologoDB = odontologoService.registrarOdontologo(odontologo);
        assertNotNull(odontologoDB);
    }

    @Test
    @DisplayName("Testear que se listan los Odontologos")
    void listarTodos() {
        Odontologo odontologo = new Odontologo("LUGO", "DIANA", "TU906483");
        odontologoService.registrarOdontologo(odontologo);
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        assertEquals(1, odontologos.size());
    }
}