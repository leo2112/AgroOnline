package co.udea.AgroOnline.modelo;



@Entity
@Table(name = administrador)
public class Administrador extends Persona {

    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "estadoAdmi")
    private boolean estadoAdmi;

    public boolean isEstadoAdmi() {
        return estadoAdmi;
    }

    public void setEstadoAdmi(boolean estadoAdmi) {
        this.estadoAdmi = estadoAdmi;
    }
}
