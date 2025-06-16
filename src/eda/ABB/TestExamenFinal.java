package eda.ABB;

import java.util.LinkedList;

public class TestExamenFinal {

    public static void main(String[] args) {
        Arbol arbol1 = new Arbol();
        Arbol arbol2 = new Arbol();

        // Insertar elementos en los árboles
        int[] elementos1 = {10,4,3,5};
        int[] elementos2 = {4,3,5};

        for (int num : elementos1) {
            arbol1.agregar(num);
        }

        for (int num : elementos2) {
            arbol2.agregar(num);
        }

        Arbol arbol3 = new Arbol();
       

        // Insertar elementos en los árboles
        
        int[] elementos3 = {6,4,5};

       for (int num : elementos3) {
            arbol3.agregar(num);
        }
System.out.println("---------------Prueba Primer Punto-------------------------------");
        //------------------------Pueba primer punto------------------------

        System.out.println("Caso 1: Arbol a es subarbol de b? " + arbol2.esSubarbol(arbol2, arbol1));
        System.out.println("Caso2: Arbol c es subarbol de d?" + arbol3.esSubarbol(arbol3, arbol1));

       

         

System.out.println("---------------Prueba Segundo Punto-------------------------------");
 Arbol arbolPrueba = new Arbol();


 int[]elementosPrueba = {10,6,4,8,15,20};
   for (int num : elementosPrueba) {
            arbolPrueba.agregar(num);
        }
boolean existe = arbolPrueba.rutaSum(20, arbolPrueba.getRaiz());
boolean noExiste = arbolPrueba.rutaSum(19, arbolPrueba.getRaiz());
  System.out.println("Caso 1 - Existe la ruta?  " +  existe );   
  System.out.println("Caso 2 - Existe la ruta?  " +  noExiste );     
 
        



System.out.println("---------------Prueba Tercer Punto-------------------------------");

//----------------------prueba tercer Punto------------------------------------

 Arbol arbol5 = new Arbol();

        // Insertar elementos en los árboles
        int[] elementos5 = {4,3,6,5,9,10,200,54};
         for (int num : elementos5) {
            arbol5.agregar(num);
        }

       

     LinkedList<Integer> lista = new LinkedList<>();
       lista = arbol5.inOrderList(arbol5.getRaiz(), lista);
      
       for(int i: lista){
        System.out.print("->"+i + "<-");
       }

 
    }
}
