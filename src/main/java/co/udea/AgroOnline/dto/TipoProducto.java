package co.udea.AgroOnline.dto;


import javax.persistence.*;

public class TipoProducto {

    public Long id_tipo;
    public String nombre;
    public String descripcion;

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long idtipo) {
        this.id_tipo = idtipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
