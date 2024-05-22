package dh.backend.test;

import dh.backend.dao.impl.OdontologoDaoH2;
import dh.backend.model.Odontologo;
import dh.backend.service.OdontologoService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    private static Logger LOGGER = Logger.getLogger(OdontologoServiceTest.class);
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @BeforeAll
    static void crearTablas(){
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/parcialBackend;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "sa");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                LOGGER.error(e.getMessage());
            }
        }
    }


    @Test
    @DisplayName("Testear que un Odontologo fue registrado")

    void testRegistrarOdontologo() {
        Odontologo odontologo = new Odontologo("PEREZ", "GENARO", "TU785273");
        Odontologo odontologoDB = odontologoService.registrarOdontologo(odontologo);
        assertNotNull(odontologoDB);
    }

    @Test
    @DisplayName("Testear que un Odontologo fue registrado")
    void listarOdontologos() {
        Odontologo odontologo = new Odontologo("LUGO", "DIANA", "TU906483");
        odontologoService.registrarOdontologo(odontologo);
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        assertEquals(4, odontologos.size());
    }
}