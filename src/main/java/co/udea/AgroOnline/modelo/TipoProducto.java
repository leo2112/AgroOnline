package co.udea.AgroOnline.modelo;


import javax.persistence.*;

@Entity
@Table(name = "tipo_producto")
public class TipoProducto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    public Long id_tipo;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "descripcion")
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
