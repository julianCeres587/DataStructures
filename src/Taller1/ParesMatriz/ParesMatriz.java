//De una matriz de enteros y un número, necesita escribir un programa
// para encontrar todos los elementos en la matriz cuya suma es igual al
// número dado.

package Taller1.ParesMatriz;

import java.util.ArrayList;
import AlgoritmosDeBsqueda.BusquedaBinariaArrayList;
import SortingAlgorithms.InsertionSort;

public class ParesMatriz {

    public static ArrayList<String> paresMatriz(int numero, int[][] matriz){
         int[] complementos = new int[matriz.length * matriz[0].length]; //copiar matriz en un arreglo y otro con los complementos
         int[] elementosMatriz = new int[matriz.length * matriz[0].length];
         int elementosComplemento = 0;
         
         for(int i = 0 ; i< matriz.length; i++){
              for(int j = 0; j<matriz[i].length;j++){
                   elementosMatriz[elementosComplemento] = matriz[i][j];
                   complementos[elementosComplemento] = numero - matriz[i][j];
                   elementosComplemento++;
              }
         }
         
         complementos = InsertionSort.insertionSort(complementos); //ordenar ambos arreglos
         elementosMatriz = InsertionSort.insertionSort(elementosMatriz); //para poder eliminar repetidos mas facil
         ArrayList <Integer> complementosLimpio = new ArrayList<Integer>();
         ArrayList <Integer> matrizLimpia = new ArrayList<Integer>();
         matrizLimpia.add(elementosMatriz[0]);    //agrega el primero para evitar la perdida del último en el ciclo dado que no 
         complementosLimpio.add(complementos[0]); //cumpla la condición, antes los index estaban al revés 
                                                  
          for(int i=1;i<complementos.length;i++){ //agrega una sola vez todos los elemntos
              if(elementosMatriz[i]!=elementosMatriz[i-1]){//elimino los repetidos en ambos para agregar el par una sola vez
               matrizLimpia.add(elementosMatriz[i]);
              }
              if(complementos[i]!=complementos[i-1]){//
               complementosLimpio.add(complementos[i]);
              }
          } 
              
         ArrayList <String> pares = new ArrayList<String>(); //Ahora, buscar los elementos con coincidencias en la matriz, con el arreglo de complementos
                                                             //si 3 está en complemento, hay un 4 en los datos origninales
         for(Integer num : matrizLimpia){                    //al detectarse el 3 en ambos arrayList, se sabe está el par con el que da la suma esperada
           if(BusquedaBinariaArrayList.busquedaBinariaArrayList(complementosLimpio, num) != -1){
              if(num < numero-num){  //validacion para que el par se agregue un sola vez
               pares.add("(" + num + "," + (numero-num) + ")");
              }
              if(num == numero-num){
                int contador = 0;
                 for(int i = 0; i<elementosMatriz.length && contador < 2;i++){
                     if(elementosMatriz[i] == num){
                         contador++;
                     }
                     }  //controla los casos donde hay dos numeros iguales
                     if(contador == 2){ //verifica que el número exista mas de una vez  
                         pares.add("(" + num + "," + (numero-num) + ")");
                     }
               }
             }
          }  
          return pares;
        }
        public static void main(String[] args) {
          int[][] numeros = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9} 
                            };
          int objetivo = 10 ;
          ArrayList <String> resultado = paresMatriz(objetivo, numeros );
          if(resultado.isEmpty()){
               System.out.println("No hay pares");
          }
          for(String par: resultado){
               System.out.print(par);
          }
       }   
}

    
    

