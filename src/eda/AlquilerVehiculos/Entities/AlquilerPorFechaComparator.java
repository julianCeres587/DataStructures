package eda.AlquilerVehiculos.Entities;

import java.util.Comparator;

public class AlquilerPorFechaComparator implements Comparator<Alquiler> {

    @Override
    public int compare(Alquiler o1, Alquiler o2) {
        return o1.getFechaInicio().compareTo(o2.getFechaInicio());

    }
}
