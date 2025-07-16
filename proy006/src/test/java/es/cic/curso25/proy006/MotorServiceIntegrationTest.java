package es.cic.curso25.proy006;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.cic.curso25.proy006.Model.Motor;
import es.cic.curso25.proy006.Service.MotorService;

@SpringBootTest
public class MotorServiceIntegrationTest {
    @Autowired
    private MotorService motorService;

    @Test
    public void testCreate(){
        Motor motorACrear = new Motor();
        motorACrear.setEncendido(true);
        motorACrear.setPotencia(2.1);
        motorACrear.setMarca("Iveco");

        long idAsignado = motorService.create(motorACrear);

        assertTrue(idAsignado > 0, String.format("El id es %d y no debe ser no positivo", idAsignado));
    }
}
