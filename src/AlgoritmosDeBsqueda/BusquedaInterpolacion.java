/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * 
 * //sirve con datos ordenados de forma ascendente, si la entrada es así se puede usar.
 */// además deben tener distancias similares
package AlgoritmosDeBsqueda;

/**
 *
 * @author DOCENTE
 */
public class BusquedaInterpolacion {
    public static int busquedaInterpolacion(int[] arr, int objetivo) {
        int izquierda = 0, derecha = arr.length - 1;

        while (izquierda <= derecha && arr[izquierda] <= objetivo && arr[derecha] >= objetivo) {
            if (izquierda == derecha) {
                if (arr[izquierda] == objetivo) return izquierda;
                return -1;
            }

            int pos = izquierda + ((objetivo - arr[izquierda]) * (derecha - izquierda)) / (arr[derecha] - arr[izquierda]);

            if (arr[pos] == objetivo)
                return pos;
            if (arr[pos] < objetivo)
                izquierda = pos + 1;
            else
                derecha = pos - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int objetivo = 40;
        int resultado = busquedaInterpolacion(numeros, objetivo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}

