package es.cic.curso25.proy006;

import org.springframework.stereotype.Service;

@Service
public class Habitoservice {
    private long contador;

    public long create(Habito habito){
        return ++contador;
    }

    public long getContador(){
        return this.contador;
    }
}
