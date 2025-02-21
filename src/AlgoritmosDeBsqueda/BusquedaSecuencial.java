/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeBsqueda;

/**
 *
 * @author DOCENTE
 */
public class BusquedaSecuencial {
    public static int busquedaSecuencial(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;  // Retorna la posición donde se encontró
            }
        }
        return -1;  // Retorna -1 si no se encuentra
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int objetivo = 30;
        int resultado = busquedaSecuencial(numeros, objetivo);
        
        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}

