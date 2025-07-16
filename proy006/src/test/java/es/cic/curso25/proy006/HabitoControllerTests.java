package es.cic.curso25.proy006;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HabitoControllerTests {
    @Autowired
    HabitoController habitoController;

    @Test
    void testCreate() {
        long idResultado = habitoController.create(null);
        assertTrue(idResultado > 0);
    }

    // @Test
    // void testDelete() {

    // }

    // @Test
    // void testGet() {

    // }

    // @Test
    // void testUpdate() {

    // }
}
