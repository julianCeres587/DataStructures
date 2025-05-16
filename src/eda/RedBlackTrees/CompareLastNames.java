package eda.RedBlackTrees;

import java.util.Comparator;

public class CompareLastNames implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        String apellido1 = extraerApellido(o1);
        String apellido2 = extraerApellido(o2);
        return apellido1.compareToIgnoreCase(apellido2);
    }

    private String extraerApellido(String nombre){
         int espacio = nombre.trim().lastIndexOf(' ');
         String apellido = nombre.trim().substring(espacio+1);
         return apellido;

    }


    
}
