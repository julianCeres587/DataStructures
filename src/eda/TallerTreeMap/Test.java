package eda.TallerTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {

        System.out.println("----------------------Comparador Por Código--------------------------------\n");

        Estudiante estudiante1 = new Estudiante("1152458","Julian Camilo Caceres Calderon", "Ingenieria de Sistemas", 3.78 );
        Estudiante estudiante2 = new Estudiante("1152479","Juan Diego Ardila Bueno", "Ingenieria de Sistemas", 5.0 );
        Estudiante estudiante3 = new Estudiante("1115678","Pedro Alexander Contreras Contreras", "Ingenieria Civil", 4.67 );
        Estudiante estudiante4 = new Estudiante("1152458","Jimmy Velandia Mocoy", "Ingenieria de Sistemas", 3.71 );
        Estudiante estudiante5 = new Estudiante("1192678","Marcela Galindo Gutierrez", "Comunicacion Social", 3.33 );
        Estudiante estudiante6 = new Estudiante("1152455","Juan Carlos Barajas Quintero", "Ingenieria de Sistemas", 3.123 );
        Estudiante estudiante7 = new Estudiante("1142458","Bryan Alexander Gelves Toloza", "Ingenieria Ambiental", 2.78 );
        Estudiante estudiante8 = new Estudiante("1162457","Wendy Alexandra Peñaranda Jaimes", "Arquitectura", 0.98);
       
         TreeMap  <String,Estudiante> estudiantes = new TreeMap<>(new CompareCodigo());
        estudiantes.put(estudiante1.getCodigo(),estudiante1);
        estudiantes.put(estudiante2.getCodigo(),estudiante2);
        estudiantes.put(estudiante3.getCodigo(),estudiante3);
        estudiantes.put(estudiante4.getCodigo(),estudiante4);
        estudiantes.put(estudiante5.getCodigo(),estudiante5);
        estudiantes.put(estudiante6.getCodigo(),estudiante6);
        estudiantes.put(estudiante7.getCodigo(),estudiante7);
        estudiantes.put(estudiante8.getCodigo(),estudiante8);
        mostrarEstudiantes(estudiantes);
        System.out.println();
         //inicialmente ordena por orden natural, a las keys,eso viene de la estructura no los values
         //ese ordenn  natural lo podemos aplicar con cadenas(Strings), numeroes y fechas,
         //pero loss demas no asdmiten un orden natural, como clases persnalizaad, objetos, etc. para ellos\
         //usamos el Comparator
         System.out.println("----------------------Comparador Por Promedio--------------------------------\n");
         TreeMap  <Estudiante,String> estudiantes2 = new TreeMap<>(new ComparePromedio());  //le pasamos la comparacion que va a validar
        estudiantes2.put(estudiante1,estudiante1.getCodigo());
        estudiantes2.put(estudiante2,estudiante2.getCodigo());
        estudiantes2.put(estudiante3,estudiante3.getCodigo());
        estudiantes2.put(estudiante4,estudiante4.getCodigo());
        estudiantes2.put(estudiante5,estudiante5.getCodigo());
        estudiantes2.put(estudiante6,estudiante6.getCodigo());
        estudiantes2.put(estudiante7,estudiante7.getCodigo());
        estudiantes2.put(estudiante8,estudiante8.getCodigo());
        mostrarEstudiantesPromedio(estudiantes2);
    }

    public static void mostrarEstudiantes(TreeMap<String,Estudiante> map){
        for(Map.Entry<String,Estudiante> entry: map.entrySet()){   
               System.out.println("Codigo: " + entry.getKey() + " | Estudiante: " + entry.getValue().getNombreCompleto());
        }
    }

     public static void mostrarEstudiantesPromedio(TreeMap<Estudiante,String> map){
        for(Map.Entry<Estudiante,String> entry: map.entrySet()){   
               System.out.println("Estudiante: " + entry.getKey().getNombreCompleto() + " | Promedio: " + entry.getKey().getPromedio() +  " | Codigo: " + entry.getValue());
        }
    }
    
}
