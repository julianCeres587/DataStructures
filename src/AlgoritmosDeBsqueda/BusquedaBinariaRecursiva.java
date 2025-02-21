/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeBsqueda;

/**
 *
 * @author DOCENTE
 */
public class BusquedaBinariaRecursiva {
    public static int busquedaBinariaRecursiva(int[] arr, int objetivo, int izquierda, int derecha) {
        if (izquierda > derecha) {
            return -1; // No encontrado
        }

        int medio = izquierda + (derecha - izquierda) / 2;

        if (arr[medio] == objetivo)
            return medio;

        if (arr[medio] < objetivo)
            return busquedaBinariaRecursiva(arr, objetivo, medio + 1, derecha);
        else
            return busquedaBinariaRecursiva(arr, objetivo, izquierda, medio - 1);
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int objetivo = 30;
        int resultado = busquedaBinariaRecursiva(numeros, objetivo, 0, numeros.length - 1);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
