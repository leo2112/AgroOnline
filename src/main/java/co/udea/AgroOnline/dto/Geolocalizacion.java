package co.udea.AgroOnline.dto;

@Entity
@Table(name = geolocalizacion)
public class Geolocalizacion extends GoogleMap {

    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "departamento")
    public String departamento;
    @Colum(name = "ciudad")
    public String ciudad;
    @Colum(name = "barrioVereda")
    public String barrioVereda;

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

    public String getBarrioVereda() {
        return barrioVereda;
    }

    public void setBarrioVereda(String barrioVereda) {
        this.barrioVereda = barrioVereda;
    }
}
