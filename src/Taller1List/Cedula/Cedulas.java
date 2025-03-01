package Taller1List.Cedula;



import AlgoritmosDeBsqueda.BusquedaBinariaList;
import SortingAlgorithms.InsertionSortList;
import edaGenericidad.linkedListG.*;

public class Cedulas {
      private LinkedList<Integer> cedulas;
      
      Cedulas(){

      }

      Cedulas(LinkedList<Integer> cedulas){
        this.cedulas = cedulas;
      }

      public void ordenar(){
        this.cedulas = InsertionSortList.insertionSort(cedulas);
      }
      //para que la busqueda binaria sirva primero ordenar
      public int existeNumero(){
        return BusquedaBinariaList.busquedaBinaria(cedulas, 19144473 );
        }
 
      public int numerosMayores(){
        int mayores = 0;
        for(int i = 0; i < cedulas.getSize(); i++){
           if(cedulas.get(i) > 19145954 ){
             mayores++;
           }
         }
        
        return mayores;
        
      }

      public LinkedList<Integer> getCedulas(){
        return this.cedulas;
      }

      public void setCedulas(LinkedList<Integer> list){
         this.cedulas = list;
      }
}

