package co.udea.AgroOnline.modelo;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long id_pedido;

    @Column(name = "fecha_pedido")
    private Date fecha_pedido;

    @Column(name = "fecha_entrega")
    private Date fecha_entrega;

    @Column(name = "total_pedido")
    private double total_pedido;

    @Column(name = "estado_pedido")
    private String estado_pedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_estado_pedido", insertable = false, updatable = false)

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public double getTotal_pedido() {
        return total_pedido;
    }

    public void setTotal_pedido(double total_pedido) {
        this.total_pedido = total_pedido;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }
}
