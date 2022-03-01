package co.udea.AgroOnline.modelo;


import javax.persistence.*;

@Entity
@Table(name = "productor")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    public Integer id_producto;


    @Column(name = "nom_producto")
    public String nom_producto;

    @Column(name = "precio")
    public double precio;

    @Column(name = "tipo")
    public String tipo;

    @Column(name = "stock")
    public double stock;

    @Column(name = "imagen")
    public String imagen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_tipo", insertable = false, updatable = false)


    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
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

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
