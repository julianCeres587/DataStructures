package AlgoritmosDeBsqueda;

import java.util.ArrayList;


public class BusquedaBinariaArrayList {
    public static int busquedaBinariaArrayList(ArrayList <Integer> arr, int objetivo) {
        int izquierda = 0, derecha = arr.size() - 1;
    

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arr.get(medio) == objetivo)
                return medio; // Elemento encontrado

            if (arr.get(medio) < objetivo)
                izquierda = medio + 1; // Buscar en la derecha
            else
                derecha = medio - 1; // Buscar en la izquierda
        }
        return -1; // No encontrado
    }

    
}
