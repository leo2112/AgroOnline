package co.udea.AgroOnline.modelo;


@Entity
@Table(name = detallePedido)
public class DetallePedido {


    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "cantidad")
    private int cantidad;

    @Colum(name = "subtotal")
    private double subtotal;

    @Colum(name = "estadoPedido")
    private String estadopedido;

    @Colum(name = "nomProducto")
    private String nomProducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_nomProducto", insertable = false, updatable = false)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_estadoPedido", insertable = false, updatable = false)

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getEstadopedido() {
        return estadopedido;
    }

    public void setEstadopedido(String estadopedido) {
        this.estadopedido = estadopedido;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }
}
