package AlgoritmosDeBsqueda;
//garantiza que la posicion que se arroja sea el elemento mas a la derecha en caso de que estén repetidos
//ordenar los elementos para garantizar que funcione correctamente, usar insertionSort

//puede usarse en casos donde el arreglo ya viene ordenado


public class BusquedaInterpolacionM {
   

    public static int busquedaInterpolacionM(int[] arr, int objetivo){
        
        boolean repetidos = true;
        int izquierda = 0, derecha = arr.length - 1;
        

        while (izquierda <= derecha && arr[izquierda] <= objetivo && arr[derecha] >= objetivo) {
            if (izquierda == derecha) {
                if (arr[izquierda] == objetivo) return izquierda;
                return -1;
            }

            int pos = izquierda + ((objetivo - arr[izquierda]) * (derecha - izquierda)) / (arr[derecha] - arr[izquierda]);

            if (arr[pos] == objetivo){
                while(repetidos == true){   //mientras haya repetidos, sigue hacia la derecha
                    if(arr[pos+1] != objetivo){
                        repetidos = false;
                     }else{
                        pos++;
                     }
                    }
                return pos;
            }
             if (arr[pos] < objetivo){
                izquierda = pos + 1;
              }
              else{
                derecha = pos - 1;
              }
                
          }
        return -1;
    }



public static void main(String[] args) {
    int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    int objetivo = 40;
    int resultado = busquedaInterpolacionM(numeros, objetivo);

    if (resultado != -1) {
        System.out.println("Elemento encontrado en la posición: " + resultado);
    } else {
        System.out.println("Elemento no encontrado");
    }
}  

}
    

