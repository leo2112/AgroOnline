package co.udea.AgroOnline.modelo;


@Entity
@Table(name = estadoFactura)
public class EstadoFactura {

    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "estadoFactura")
    private String estadoFactura;

    @Colum(name = "descripcion")
    private String descripcion;

    public String getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(String estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
