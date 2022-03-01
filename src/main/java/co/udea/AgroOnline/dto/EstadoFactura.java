package co.udea.AgroOnline.dto;


import javax.persistence.*;

public class EstadoFactura {

    private String estado_factura;
    private String descripcion;

    public String getEstado_factura() {
        return estado_factura;
    }

    public void setEstado_factura(String estadoFactura) {
        this.estado_factura = estadoFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
