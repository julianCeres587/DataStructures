package Taller1.NumeroEntre100;

//Se ha dado una matriz de enteros que contiene números del 1 al 100,
// pero falta un número, necesita escribir un programa Java para 
//encontrar ese número que falta en una matriz.

public class NumeroEntre100 {
       public static int encontrarNumero(int[] array){
        int sumatoria = 0;
        for(int i=0; i<array.length;i++){
           sumatoria += array[i];  //suma de todos los numeros que hay
        }
        return 5050-sumatoria; //5050 es la suma del 1 al 100
       }  


      
       public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int resultado = encontrarNumero(numeros);
        
            System.out.println("El número que falta es: " + resultado);
        
    }



}

