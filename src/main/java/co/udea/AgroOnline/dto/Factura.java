package co.udea.AgroOnline.dto;

import java.util.Date;


@Entity
@Table(name = factura)
public class Factura {

    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "idFactura")
    private int idFactura;

    @Colum(name = "estado")
    private String estadoFactura;

    @Colum(name = "fechaHoraEmecion")
    private Date fechaHoraEmicion;


    @Colum(name = "detalle")
    private String detalle;

    @Colum(name = "subtotal")
    private boolean subtotal;

    @Colum(name = "total")
    private boolean total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_estadoFactura", insertable = false, updatable = false)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_detalle", insertable = false, updatable = false)

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaHoraEmicion() {
        return fechaHoraEmicion;
    }

    public void setFechaHoraEmicion(Date fechaHoraEmicion) {
        this.fechaHoraEmicion = fechaHoraEmicion;
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
