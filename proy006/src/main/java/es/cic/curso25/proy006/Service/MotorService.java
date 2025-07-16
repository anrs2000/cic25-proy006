package es.cic.curso25.proy006.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.curso25.proy006.Model.Motor;
import es.cic.curso25.proy006.Repository.MotorRepository;

@Service
public class MotorService {
    @Autowired
    private MotorRepository motorRepository;

    public long create(Motor motor) {
        //Los días festivos y los fines de semana en esta empresa no se crean motores
        
        return motorRepository.create(motor);
    }
}
