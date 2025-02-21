package AlgoritmosDeBsqueda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DOCENTE
 */
//va hacia la derecha del numero encontrado para ver si hay repetidos a su derecha

public class BusquedaBinariaM {
    public static int busquedaBinariaM(int[] arr, int objetivo) {
        boolean repetidos = true;
        int izquierda = 0, derecha = arr.length - 1;
    

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arr[medio] == objetivo){
                while(repetidos == true){   //mientras haya repetidos, sigue hacia la derecha
                    if(arr[medio+1] != objetivo){
                        repetidos = false;
                     }else{
                        medio++;
                     }
                    }
                 return medio; // Elemento encontrado
            }
            

            if (arr[medio] < objetivo){
                izquierda = medio + 1; // Buscar en la derecha
            }
            else{
                derecha = medio - 1; // Buscar en la izquierda
            }
                
        }
        return -1; // No encontrado
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30,30, 40, 50};
        int objetivo = 30;
        int resultado = busquedaBinariaM(numeros, objetivo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}

