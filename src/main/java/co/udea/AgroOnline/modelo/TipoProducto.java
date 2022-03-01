package co.udea.AgroOnline.modelo;


@Entity
@Table(name = tipoProducto)
public class TipoProducto {

    @Entity
    @Table(name = idtipo)
    public Long idtipo;

    @Table(name = nombre)
    public String nombre;

    @Table(name = descripcion)
    public String descripcion;

    public Long getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(Long idtipo) {
        this.idtipo = idtipo;
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
