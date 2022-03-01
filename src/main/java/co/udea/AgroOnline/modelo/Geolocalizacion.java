package co.udea.AgroOnline.modelo;

import javax.persistence.*;

@Entity
@Table(name = "geolocalizacion")
public class Geolocalizacion extends GoogleMap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departamento")
    public String departamento;
    @Column(name = "ciudad")
    public String ciudad;
    @Column(name = "barrio_vereda")
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
