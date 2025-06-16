package eda.TallerTreeMap;

public class Estudiante {
     String codigo;
     String nombreCompleto;
     String programa;
     double promedio;

    public Estudiante(String codigo, String nombreCompleto, String programa, double promedio) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.programa = programa;
        this.promedio = promedio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    

}
