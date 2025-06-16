package eda.RedBlackTrees;

import java.util.Comparator;

public class CompareLastNames implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        String apellido1 = extraerApellido(o1);
        String apellido2 = extraerApellido(o2);
        int rta = apellido1.compareToIgnoreCase(apellido2);
        if(rta!=0){
            return rta;
        }
        else{
            String nombre1 = extraerNombre(o1);
            String nombre2 = extraerNombre(o2);
            return nombre1.compareTo(nombre2);

        }
    }

    private String extraerNombre(String nombre){
        String[] nombres = nombre.trim().split(" ");
        return nombres[0];

    }
     //el compareTo que usa eso para ordenar manda al mayor de ultimo, retorna negativo si o1 es menor, positivo si 01 es mayor
    private String extraerApellido(String nombre){
         int espacio = nombre.trim().lastIndexOf(' ');
         String apellido = nombre.trim().substring(espacio+1);
         return apellido;

    }


    
}
