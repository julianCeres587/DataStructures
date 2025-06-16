package eda.RedBlackTrees;

import java.util.Map;
import java.util.TreeMap;

public class ExampleRedBlackTree {

    public static void main(String[] args) {
         TreeMap  <String,String> nombres = new TreeMap<>();
         nombres.put("Juan Lopez","Colombia");
         nombres.put("María Perez","Argentina");
         nombres.put("Ana contreras","Ecuador");
         nombres.put("Luis Perez","Brasil");
         printTree(nombres);
         //inicialmente ordena por orden natural, a las keys,eso viene de la estructura no los values
         //ese ordenn  natural lo podemos aplicar con cadenas(Strings), numeroes y fechas,
         //pero loss demas no asdmiten un orden natural, como clases persnalizaad, objetos, etc. para ellos\
         //usamos el Comparator
         System.out.println("----------------------");
         TreeMap  <String,String> nombres2 = new TreeMap<>(new CompareLastNames());  //le pasamos la comparacion que va a validar
         nombres2.put("Juan Lopez","Colombia");   //Ahora ordena por apellidos, la comparacion se hace solo con  las keys
         nombres2.put("María Perez","Argentina");
         nombres2.put("Ana contreras","Ecuador");
         nombres2.put("Luis Perez","Brasil");     //el tree map no admite repetidos
         printTree(nombres2);
    }

    public static void printTree(TreeMap<String,String> map){
        for(Map.Entry<String,String> entry: map.entrySet()){   //en la socumentacion sale, en entry obtenemos key y valor
               System.out.println("Id :" + entry.getKey() + " Valor: " + entry.getValue());
        }
    }
    
}

