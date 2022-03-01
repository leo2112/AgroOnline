package co.udea.AgroOnline.dto;


import javax.persistence.*;

public class Administrador extends Persona {


    private boolean estado_admi;

    public boolean isEstado_admi() {
        return estado_admi;
    }

    public void setEstado_admi(boolean estado_admi) {
        this.estado_admi = estado_admi;
    }
}
