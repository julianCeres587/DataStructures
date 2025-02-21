package Taller1.ExtremoMatriz;

//Dada una matriz de enteros sin ordenar y necesita encontrar el
//elemento más grande y el más pequeño en la matriz.

import SortingAlgorithms.*;

public class ExtremoMatriz {
     
    public static int[] extremosMatriz(int[][] matriz){
      int[] elementosMatriz = new int[matriz.length * matriz[0].length];//asegura poder copiar todos los elementos de la matriz
      int contadorElementos = 0;
      for(int i = 0; i < matriz.length;i++){
        for(int j=0; j < matriz[i].length;j++){
            elementosMatriz[contadorElementos] = matriz[i][j];
            contadorElementos++;
        }
      }   //convertir matriz en arreglo
      elementosMatriz = InsertionSort.insertionSort(elementosMatriz);
      int[] elementos = {elementosMatriz[0],elementosMatriz[elementosMatriz.length-1]};
      return elementos;
    }

    public static int[] extremosMatriz2(int[][] matriz){
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        for(int i = 0; i < matriz.length;i++){
            for(int j=0; j < matriz[i].length;j++){
                 if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                 }
                 if(matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                 }
              }
          }   //identificar el mayor y el menor pasando una sola vez
           int[] resultados = {menor,mayor};
           return resultados;
     }

    public static void main(String[] args) {
        int[][] matriz = {
                            {10, 20, 30, 40, 50, 60, 70, 90, 90},
                            {10, 20, 20, 20, 10, 10, 50, 3, 2}
                          };
            
        int[] resultado = extremosMatriz2(matriz);
        
            System.out.println("El número más pequeño en la matriz es : " + resultado[0]+
                                ", El más grande es: " + resultado[1]);
        
    }


}
