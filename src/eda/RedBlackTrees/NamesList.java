package eda.RedBlackTrees;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NamesList {
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
         "Juan Lopez",  
        "Maria Lopez",
        "Ana Contreras",
        "Luis Perez"


        );
        Collections.sort(names, new CompareLastNames() );  //usa metodo de ckase de comparacion personalizado, recibe la comparacion que usaremos
        for(String  name: names){
            System.out.println("Nombre: " + name);  //ahora ordenamos por apellidos

        }
    }
}
