package eda.AlquilerVehiculos.Entities;

public class Clientes {
    String id;
    String nombre;

    public Clientes(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Clientes() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "id : " + id + " Nombre : " + nombre ;
    }
}
