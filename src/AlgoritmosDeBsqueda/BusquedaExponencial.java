/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeBsqueda;

/**
 *
 * @author DOCENTE
 */
public class BusquedaExponencial {
    public static int busquedaExponencial(int[] arr, int objetivo) {
        if (arr[0] == objetivo) return 0;

        int i = 1;
        while (i < arr.length && arr[i] <= objetivo) {
            i *= 2;
        }

        return busquedaBinaria(arr, objetivo, i / 2, Math.min(i, arr.length - 1));
    }

    public static int busquedaBinaria(int[] arr, int objetivo, int izquierda, int derecha) {
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arr[medio] == objetivo)
                return medio;

            if (arr[medio] < objetivo)
                izquierda = medio + 1;
            else
                derecha = medio - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int objetivo = 30;
        int resultado = busquedaExponencial(numeros, objetivo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
