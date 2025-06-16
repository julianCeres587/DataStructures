package SortingAlgorithms;
import edaGenericidad.doublyLinkedListG.*;

//compareTo con strings tiene en cuenta mayusculas y minusculas, para ignorar comparteToIgnoreCase

public class InsertionSortListFinal {
    public static <T extends Comparable<T>> DoublyLinkedList<T> insertionSortGenericList(DoublyLinkedList<T> list) {
        DoublyLinkedList<T> sorted = new DoublyLinkedList<>();
        for (int i = 0; i < list.getSize() - 1; i++) {

            //si  la primera vez, el numero de la derecha es menor que el inicial
            if (i == 0 && list.get(i + 1).compareTo(list.get(i)) < 0) {
                T temp = list.get(i + 1);
                list.getNode(i + 1).setValue(list.get(i)); //apunta al otro objeto
                list.getNode(i).setValue(temp);

            }

            //para el resto de casos, manejar la parte ordenada del arreglo
            //y encontrar la posicion del nuevo elemento
            if (list.get(i + 1).compareTo(list.get(i)) < 0) {
                //agregar al inicio
                for (int j = 0; j < i; j++) { //ciclo que se mueve por los elementos ordenados, para encontrar
                    //la posicion a donde pertenece si se cumple la condicion dada
                    if (list.get(i + 1).compareTo(list.get(j)) < 0) { //si el numero que se va a agregar es el mas pequeña
                        T temp = list.get(i + 1);

                        for (int k = i + 1; k > 0; k--) {
                            list.getNode(k).setValue(list.get(k - 1));
                        }
                        list.getFirstNode().setValue(temp);
                    }
                    if (list.get(i + 1).compareTo(list.get(j)) >= 0 && list.get(i + 1).compareTo(list.get(j + 1)) < 0) {//busca la posicion que corresponde en la parte ordenada
                        T temp = list.get(i + 1);             //del arreglo, cuando está en la posicon donde va el elemento, deja de mover a la derecha
                        //dejando el espacio que requiere y lo inserta
                        int posicion = 0;
                        for (int k = i + 1; k > j + 1; k--) {
                            list.getNode(k).setValue(list.get(k - 1)); //abre espacio en la posicion correspondiente
                            posicion = k - 1;
                        }
                        list.getNode(posicion).setValue(temp);
                    }
                }
            }
        }
        return list;

  }
}