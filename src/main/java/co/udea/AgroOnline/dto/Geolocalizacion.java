package co.udea.AgroOnline.dto;

import javax.persistence.*;

public class Geolocalizacion extends GoogleMap {

    public String departamento;
    public String ciudad;
    public String barrio_vereda;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio_vereda() {
        return barrio_vereda;
    }

    public void setBarrio_vereda(String barrioVereda) {
        this.barrio_vereda = barrioVereda;
    }
}
