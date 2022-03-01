package co.udea.AgroOnline.modelo;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private int id_factura;

    @Column(name = "estado_factura")
    private String estado_factura;

    @Column(name = "fecha_hora_emecion")
    private Date fecha_hora_emicion;


    @Column(name = "detalle")
    private String detalle;

    @Column(name = "subtotal")
    private boolean subtotal;

    @Column(name = "total")
    private boolean total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_estado_factura", insertable = false, updatable = false)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_detalle", insertable = false, updatable = false)


    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getEstado_factura() {
        return estado_factura;
    }

    public void setEstado_factura(String estado_factura) {
        this.estado_factura = estado_factura;
    }

    public Date getFecha_hora_emicion() {
        return fecha_hora_emicion;
    }

    public void setFecha_hora_emicion(Date fecha_hora_emicion) {
        this.fecha_hora_emicion = fecha_hora_emicion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean isSubtotal() {
        return subtotal;
    }

    public void setSubtotal(boolean subtotal) {
        this.subtotal = subtotal;
    }

    public boolean isTotal() {
        return total;
    }

    public void setTotal(boolean total) {
        this.total = total;
    }
}
