package co.udea.AgroOnline.dto;

import java.util.Date;
 
@Entity
@Table(name = pago)
public class Pago {

    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "idfactura")
    private Long idfactura;

    @Colum(name = "fecha")
    private Date fecha;

    @Colum(name = "descripcion")
    private String descripcion;

    @Colum(name = "total")
    private double total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_idfactura", insertable = false, updatable = false)

    public Long getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Long idfactura) {
        this.idfactura = idfactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
 
}
