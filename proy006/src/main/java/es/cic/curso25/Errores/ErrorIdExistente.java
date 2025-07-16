package es.cic.curso25.Errores;

public class ErrorIdExistente extends RuntimeException{
    public ErrorIdExistente(String mensaje, Exception error){
        super(mensaje, error);
    }
}
