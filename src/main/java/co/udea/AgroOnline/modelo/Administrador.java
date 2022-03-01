package co.udea.AgroOnline.modelo;


import javax.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador extends Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_admi")
    private boolean estado_admi;

    public boolean isEstado_admi() {
        return estado_admi;
    }

    public void setEstado_admi(boolean estado_admi) {
        this.estado_admi = estado_admi;
    }
}
