package eda.AlquilerVehiculos.Entities;

import java.time.LocalDate;

public class Alquiler {
    Clientes cliente;
    Vehiculo vehiculo;
    LocalDate fechaInicio;
    int dias;

    public Alquiler(Clientes cliente, Vehiculo vehiculo, LocalDate fechaInicio, int dias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.dias = dias;
    }

    public Alquiler() {
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
