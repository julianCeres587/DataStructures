package EjerciciosEE.NumeroCedula;

import AlgoritmosDeBsqueda.BusquedaBinaria;
import SortingAlgorithms.InsertionSort;

public class Cedulas {
      private int[] cedulas;
      
      Cedulas(){

      }

      Cedulas(int[] cedulas){
        this.cedulas = cedulas;
      }

      public void ordenar(){
        this.cedulas = InsertionSort.insertionSort(cedulas);
      }

      public int existeNumero(){
        return BusquedaBinaria.busquedaBinaria(cedulas, 19144473 );
        }
 
      public int numerosMayores(){
        int mayores = 0;
        for(int i = 0; i < cedulas.length; i++){
           if(cedulas[i] > 19145954 ){
             mayores++;
           }
         }
        
        return mayores;
        
      }

      public int[] getCedulas(){
        return this.cedulas;
      }

      public void setCedulas(int[] array){
         this.cedulas = array;
      }
}
