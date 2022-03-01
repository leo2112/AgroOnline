package co.udea.AgroOnline.modelo;


import javax.persistence.*;

@Entity
@Table(name = "estado_factura")
public class EstadoFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_factura")
    private String estado_factura;

    @Column(name = "descripcion")
    private String descripcion;

    public String getEstado_factura() {
        return estado_factura;
    }

    public void setEstado_factura(String estadoFactura) {
        this.estado_factura = estadoFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
