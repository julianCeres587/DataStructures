package SortingAlgorithms;



public class InsertionSort {

    public static int[] insertionSort(int[]array){
           
        for(int i=0; i<array.length-1;i++){
        
        //si  la primera vez, el numero de la derecha es menor que el inicial
        if(i == 0 && array[i+1] < array[i]){
            int temp = array[i+1];
            array[i+1] = array[i];
            array[i] = temp; 
        }

        //para el resto de casos, manejar la parte ordenada del arreglo
        //y encontrar la posicion del nuevo elemento
              if(array[i+1] < array[i]){
                   //agregar al inicio
                   for(int j=0;j<i;j++){ //ciclo que se mueve por los elementos ordenados, para encontrar
                                         //la posicion a donde pertenece si se cumple la condicion dada
                          if(array[i+1] < array[j]){ //si el numero que se va a agregar es el mas pequeña
                            int temp = array[i+1];
                            
                            for(int k=i+1; k>0;k--){
                                array[k] = array[k-1];
                            }
                            array[0] = temp;
                        }
                          if(array[i+1] >= array[j] && array[i+1] < array[j+1]){//busca la posicion que corresponde en la parte ordenada
                            int temp = array[i+1];             //del arreglo, cuando está en la posicon donde va el elemento, deja de mover a la derecha
                                      //dejando el espacio que requiere y lo inserta
                            int posicion = 0;
                            for(int k = i+1; k> j+1;k--){
                                array[k] = array[k-1];        //abre espacio en la posicion correspondiente
                                posicion = k-1;
                            }
                            array[posicion] = temp;
                            } 
                }
          }
     }
    return array;
  }  
  
  



  public static void main(String[] args) {
    
       int[] arreglo = {4,3,2,2,1,5,6,8,23,2,-1,-3,0};



        int[] resultado = insertionSort(arreglo);
     System.out.print("[");
    for(int i=0; i<resultado.length;i++){
        if(i==resultado.length-1){
            System.out.print(resultado[i]);
        }
        else{
            System.out.print(resultado[i] + ",");
        }
       
    }
    System.out.print("]");
    
    }
}


