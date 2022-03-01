package co.udea.AgroOnline.modelo;


import javax.persistence.*;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subtotal")
    private double subtotal;

    @Column(name = "estado_pedido")
    private String estado_pedido;

    @Column(name = "nom_producto")
    private String nom_producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_nom_producto", insertable = false, updatable = false)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_estado_pedido", insertable = false, updatable = false)

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

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstadopedido(String estadopedido) {
        this.estado_pedido = estadopedido;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nomProducto) {
        this.nom_producto = nomProducto;
    }
}
