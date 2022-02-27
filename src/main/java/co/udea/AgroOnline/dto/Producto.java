package co.udea.AgroOnline.dto;


@Entity
@Table(name = productor)
public class Producto {

    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "idProducto")
    public Integer idProducto;


    @Colum(name = "nomProducto")
    public String nomProducto;

    @Colum(name = "precio")
    public double precio;

    @Colum(name = "tipo")
    public String tipo;

    @Colum(name = "stock")
    public double stock;

    @Colum(name = "imagen")
    public String imagen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_tipo", insertable = false, updatable = false)


    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }


    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
