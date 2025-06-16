package eda.AlquilerVehiculos.Entities;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;



public class SistemaAlquiler {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("12467", "Julio Rondón Rondón");
        Clientes cliente2 = new Clientes("89032", "JuLian Camilo Cáceres Calderón");
        Clientes cliente3 = new Clientes("90236", "Juan Diego Argila Bueno");
        Clientes cliente4 = new Clientes("67842", "Juan Carlos Barajas Quintero");
        Clientes cliente5 = new Clientes("45672", "Bryan Sneider Gélvez Toloza");

        Vehiculo vehiculo1 = new Vehiculo("XQL018", "KIA", "2011");
        Vehiculo vehiculo2 = new Vehiculo("GAD080", "CHEVROLET", "2017");
        Vehiculo vehiculo3 = new Vehiculo("DAL890", "TOYOTA", "2024");
        Vehiculo vehiculo4 = new Vehiculo("MAR673", "FORD", "2020");
        Vehiculo vehiculo5 = new Vehiculo("ZEN902", "KIA", "2021");

        Alquiler alquiler1 = new Alquiler(cliente1, vehiculo1, LocalDate.of(2025, 04, 01), 14);
        Alquiler alquiler2 = new Alquiler(cliente2, vehiculo2, LocalDate.of(2025, 02, 10), 2);
        Alquiler alquiler3 = new Alquiler(cliente3, vehiculo3, LocalDate.of(2025, 04, 5), 9);
        Alquiler alquiler4 = new Alquiler(cliente4, vehiculo4, LocalDate.of(2025, 01, 30), 21);
        Alquiler alquiler5 = new Alquiler(cliente5, vehiculo5, LocalDate.of(2025, 02, 2), 3);

        Alquiler alquileresAgregar[] = { alquiler1, alquiler2, alquiler3, alquiler4, alquiler5 };

        TreeMap<Alquiler, Vehiculo> alquileres = new TreeMap<>(new AlquilerPorFechaComparator());
    
        for (int i = 0; i < 5; i++) {
            alquileres.put(alquileresAgregar[i], alquileresAgregar[i].getVehiculo());
        }

        mostrarAlquileresFecha(alquileres);   ///el comparador elimina si los encuentra repetidos, si eso pasa, que compare por otra condicion

    }
    //En el tree map la busqueda es como en arboles
    public static void mostrarAlquileresFecha(TreeMap<Alquiler,Vehiculo> map){
        for(Map.Entry<Alquiler,Vehiculo> entry: map.entrySet()){  
               Alquiler alquiler = entry.getKey(); 
               System.out.println("----------------------------------");
               System.out.println("Fecha : " + alquiler.getFechaInicio() + "\nCliente: \n " + alquiler.getCliente() + " \nVehiculo : \n"  + entry.getValue()  + " \nDias : "+ alquiler.getDias());   //puede imprimir con entry.getValue o si la clave tiene todos los valores, con eso
             
        }
    }
}
