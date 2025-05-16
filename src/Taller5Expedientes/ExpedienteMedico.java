package Taller5Expedientes;

import java.util.Date;
import java.util.LinkedList;

public class ExpedienteMedico {

    private String id;
    private String nombre;
    private Date fechaNacimiento;
    private String tipoSangre;
    LinkedList<String> historialMedico;

    public ExpedienteMedico() {
    }


    public ExpedienteMedico(String id, String nombre, Date fechaNacimiento, String tipoSangre,
            LinkedList<String> historialMedico) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.historialMedico = historialMedico;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public LinkedList<String> getHistorialMedico() {
        return historialMedico;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setHistorialMedico(LinkedList<String> historialMedico) {
        this.historialMedico = historialMedico;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ExpedienteMedico other = (ExpedienteMedico) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    } 

}
