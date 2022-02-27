package co.udea.AgroOnline.dto;


@Entity
@Table(name = estadoPedido)
public class EstadoPedido {

    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "estadoPedido")
    public String estadoPedido;

    @Colum(name = "descripcion")
    public String descripcion;

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstado(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
