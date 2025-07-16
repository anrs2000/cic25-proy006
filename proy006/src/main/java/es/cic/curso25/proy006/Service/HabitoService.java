package es.cic.curso25.proy006.Service;

import org.springframework.stereotype.Service;

import es.cic.curso25.proy006.Model.Habito;

@Service
public class HabitoService {
    private long contador;

    public long create(Habito habito){
        return ++contador;
    }

    public long getContador(){
        return this.contador;
    }
}
