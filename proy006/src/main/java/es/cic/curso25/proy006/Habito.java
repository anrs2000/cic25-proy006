package es.cic.curso25.proy006;

import java.sql.Date;
import java.time.LocalDate;

public class Habito {

    public enum Categoria {
        SALUD,
        EDUCACION,
        FINANZAS,
        PRODUCTIVIDAD,
        CREATIVIDAD,
        RELACIONES,
        DESARROLLO_PERSONAL,
        OCIO,
        ORGANIZACION,
        SOSTENIBILIDAD
    };

    // ATRIBUTOS
    public String nombre;
    public String descripcion;
    public LocalDate fechaInicio;
    public boolean estado;
    public long id;

    public Categoria categoria;

    public Date ultimaFechaCompletada;

    public Date[] fechasCompletadas;

    // Constructor
    // public Habitos(String nombre, String descripcion, Date fechaInicio, boolean estado, Categoria categoria,
    //         Date ultimaFechaCompletada, Date[] fechasCompletadas) {
    //             this.nombre = nombre;
    // }

    // Getter

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public long getId(){
        return this.id;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public Date getUltimaFechaCompletada() {
        return this.ultimaFechaCompletada;
    }

    public Date[] getFechasCompletadas() {
        return this.fechasCompletadas;
    }

    // Setter
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void setFechaInicio(LocalDate nuevaFechaInicio) {
        this.fechaInicio = nuevaFechaInicio;
    }

    public void setEstado(boolean nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void setId(long nuevoId){
        this.id = nuevoId;
    }

    public void setCategoria(Categoria nuevaCategoria) {
        this.categoria = nuevaCategoria;
    }

    public void setUltimaFechaCompletada(Date nuevaUltimaFecha) {
        this.ultimaFechaCompletada = nuevaUltimaFecha;
    }

    public void setFechasCompletadas(Date[] nuevasFechas) {
        this.fechasCompletadas = nuevasFechas;
    }
}
