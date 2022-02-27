package co.udea.AgroOnline.dto;

import java.util.Date;


@Entity
@Table(name = carritoCompra)
public class CarritoCompra {

    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "id")
    private Long id;

    @Colum(name = "fecha")
    private Date fecha;

    @Colum(name = "subtotal")
    private double subtotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
