package es.cic.curso25.proy006.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso25.Errores.ErrorIdExistente;
import es.cic.curso25.proy006.Model.Motor;
import es.cic.curso25.proy006.Service.MotorService;

@RestController
@RequestMapping("/motor")
public class MotorController {
    @Autowired
    MotorService motorService;

    @PostMapping
    public long create(Motor motor) {
        try {
            if (motor.getId() != null) {
                throw new RuntimeException("Al crear no me puedes pasar id");
            }
        } catch (RuntimeException e) {
            throw new ErrorIdExistente(e.getMessage(), e);
        }
        return motorService.create(motor);
    }
}
