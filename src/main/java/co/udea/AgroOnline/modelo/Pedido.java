package co.udea.AgroOnline.modelo;

import java.util.Date;


@Entity
@Table(name = pedido)
public class Pedido {

    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "idPedido")
    private Long idPedido;

    @Colum(name = "fechaPedido")
    private Date fechaPedido;

    @Colum(name = "fechaEntrega")
    private Date fechaentrega;

    @Colum(name = "totalPedido")
    private double totalpedido;

    @Colum(name = "estadoPedido")
    private String estadopedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_estadoPedido", insertable = false, updatable = false)

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public double getTotalpedido() {
        return totalpedido;
    }

    public void setTotalpedido(double totalpedido) {
        this.totalpedido = totalpedido;
    }

    public String getEstadopedido() {
        return estadopedido;
    }

    public void setEstadopedido(String estadopedido) {
        this.estadopedido = estadopedido;
    }
}
