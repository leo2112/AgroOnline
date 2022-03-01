package co.udea.AgroOnline.modelo;


import javax.persistence.*;

@Entity
@Table(name = "estadoPedido")
public class EstadoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_pedido")
    public String estado_pedido;

    @Column(name = "descripcion")
    public String descripcion;

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
