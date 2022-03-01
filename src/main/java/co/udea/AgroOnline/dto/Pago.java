package co.udea.AgroOnline.dto;

import javax.persistence.*;
import java.util.Date;
 
public class Pago {

    private Long id_factura;
    private Date fecha;
    private String descripcion;
    private double total;

    public Long getId_factura() {
        return id_factura;
    }

    public void setId_factura(Long idfactura) {
        this.id_factura = idfactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
 
}
