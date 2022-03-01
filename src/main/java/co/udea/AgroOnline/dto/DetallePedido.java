package co.udea.AgroOnline.dto;


import javax.persistence.*;

public class DetallePedido {

    private int cantidad;
    private double subtotal;
    private String estado_pedido;
    private String nom_producto;

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
