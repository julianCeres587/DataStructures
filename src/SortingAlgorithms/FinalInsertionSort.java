package SortingAlgorithms;
import EjerciciosEE.NotasDefinitivas.Nota;
import edaGenericidad.doublyLinkedListG.*;
//cuando inserta, currentnNode no se actualiza, sigue siendo ese mismo
public class FinalInsertionSort {

    public static <T extends Comparable<T>> DoublyLinkedList<T> insertionSortGenericList(DoublyLinkedList<T> list) {
        Node<T> currentNode = list.getFirstNode();

        while (currentNode.getNext() != null) {
            // manejar la parte ordenada de la lista
            if (currentNode.getNext().getValue().compareTo(currentNode.getValue()) < 0) {
                Node<T> orderedNode = list.getFirstNode();
                //ciclo que se mueve por los elementos ordenados, para encontrar la posicion a donde pertenece si se cumple la condicion dada
                while (orderedNode != currentNode.getNext()) {

                    if (currentNode.getNext().getValue().compareTo(orderedNode.getValue()) < 0) { //si el numero que se va a agregar es el mas pequeña
                        Node<T> temp = currentNode.getNext();
                        temp.getPrevious().setNext(temp.getNext());
                        temp.getNext().setPrevious(temp.getPrevious());
                        temp.setPrevious(null);
                        temp.setNext(null);
                        list.decreaseSize();
                        list.addBeginningNode(temp);
                        break;
                    }
                    //busca la posicion que corresponde en la parte ordenada //dejando el espacio que requiere y lo inserta
                    if (currentNode.getNext().getValue().compareTo(orderedNode.getValue()) >= 0 && currentNode.getNext().getValue().compareTo(orderedNode.getNext().getValue()) < 0) {
                        Node<T> temp = currentNode.getNext();
                        Node<T> space = orderedNode;
                        Node<T> insertionTemp = space.getNext();

                        if (temp.getNext() != null) {
                            temp.getNext().setPrevious(temp.getPrevious());
                            temp.getPrevious().setNext(temp.getNext());
                        } else {
                            list.deleteLast();
                            list.increaseSize(); //delete last reduce tamanio lista, pero el nodo no lo vamos a borrar, el volverá a estar
                        }
                        temp.setPrevious(null);
                        temp.setNext(null);
                        space.setNext(temp);
                        insertionTemp.setPrevious(temp);
                        temp.setNext(insertionTemp);
                        temp.setPrevious(space);
                        break;
                    }

                    orderedNode = orderedNode.getNext();
                }

            } else {
                currentNode = currentNode.getNext();
            }

        }
        return list;
    }

    public static void main(String[] args) {
        DoublyLinkedList<Double> list2 = new DoublyLinkedList<>();
        list2.addLast(2.5);
        list2.addLast(0.3);
        list2.addLast(7.1);
        list2.addLast(3.8);
        list2.addLast(1.2);

        System.out.println("Antes de ordenar (Double):");
        list2.printList();

        // Ordenar la lista
        FinalInsertionSort.insertionSortGenericList(list2);

        System.out.println("Después de ordenar (Double):");
        list2.printList();

        // Caso 1: Ordenar enteros
        DoublyLinkedList<Integer> intList = new DoublyLinkedList<>();
        intList.addLast(5);
        intList.addLast(2);
        intList.addLast(8);
        intList.addLast(1);
        intList.addLast(6);

        System.out.println("Antes de ordenar (Enteros): ");
        intList.printList();
        FinalInsertionSort.insertionSortGenericList(intList);
        System.out.println("Después de ordenar (Enteros): ");
        intList.printList();

        // Caso 2: Ordenar cadenas (Strings)
        DoublyLinkedList<String> stringList = new DoublyLinkedList<>();
        stringList.addLast("Perro");
        stringList.addLast("Gato");
        stringList.addLast("Elefante");
        stringList.addLast("Tigre");
        stringList.addLast("Jirafa");

        System.out.println("\nAntes de ordenar (Strings): ");
        stringList.printList();
        FinalInsertionSort.insertionSortGenericList(stringList);
        System.out.println("Después de ordenar (Strings): ");
        stringList.printList();

        Nota n1 = new Nota(18, "Juan");
        Nota n2 = new Nota(10, "Sofia");
        Nota n3 = new Nota(12, "Pedro");
        Nota n4 = new Nota(20, "Maria");
        Nota n5 = new Nota(6, "Carlos");
        Nota n6 = new Nota(14, "Ana");
        Nota n7 = new Nota(19, "Luis");
        Nota n8 = new Nota(15, "Elena");
        Nota n9 = new Nota(5, "Diego");
        Nota n10 = new Nota(17, "Valeria");
        Nota n11 = new Nota(13, "Fernando");
        Nota n12 = new Nota(11, "Lucia");
        Nota n13 = new Nota(8, "Raul");
        Nota n14 = new Nota(16, "Gabriela");
        Nota n15 = new Nota(7, "Manuel");
        Nota n16 = new Nota(20, "Carmen");
        Nota n17 = new Nota(4, "Esteban");
        Nota n18 = new Nota(15, "Patricia");
        Nota n19 = new Nota(9, "Alberto");
        Nota n20 = new Nota(14, "Paula");
        Nota n21 = new Nota(13, "Jorge");
        Nota n22 = new Nota(19, "Monica");
        Nota n23 = new Nota(3, "Ricardo");
        Nota n24 = new Nota(18, "Beatriz");
        Nota n25 = new Nota(12, "Andres");
        Nota n26 = new Nota(17, "Gloria");
        Nota n27 = new Nota(10, "Rodrigo");
        Nota n28 = new Nota(8, "Veronica");
        Nota n29 = new Nota(9, "Felipe");
        Nota n30 = new Nota(20, "Lorena");
        Nota n31 = new Nota(5, "Oscar");
        Nota n32 = new Nota(14, "Daniela");
        Nota n33 = new Nota(6, "Victor");
        Nota n34 = new Nota(19, "Isabel");
        Nota n35 = new Nota(3, "Samuel");
        Nota n36 = new Nota(20, "Diana");
        Nota n37 = new Nota(7, "Cesar");
        Nota n38 = new Nota(16, "Adriana");
        Nota n39 = new Nota(11, "Hugo");
        Nota n40 = new Nota(12, "Silvia");
        Nota n41 = new Nota(4, "Miguel");
        Nota n42 = new Nota(18, "Cristina");
        Nota n43 = new Nota(9, "Eduardo");
        Nota n44 = new Nota(19, "Rosa");
        Nota n45 = new Nota(8, "Guillermo");
        Nota n46 = new Nota(15, "Natalia");
        Nota n47 = new Nota(6, "Emilio");
        Nota n48 = new Nota(16, "Teresa");
        Nota n49 = new Nota(10, "Francisco");
        Nota n50 = new Nota(17, "Alejandra");
        Nota n51 = new Nota(5, "Ruben");
        Nota n52 = new Nota(18, "Angela");
        Nota n53 = new Nota(2, "Sebastian");
        Nota n54 = new Nota(14, "Vanessa");
        Nota n55 = new Nota(7, "Sergio");
        Nota n56 = new Nota(20, "Camila");
        Nota n57 = new Nota(8, "Eugenio");
        Nota n58 = new Nota(13, "Felicia");

        Nota[] notas = {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20,
            n21, n22, n23, n24, n25, n26, n27, n28, n29, n30, n31, n32, n33, n34, n35, n36, n37, n38, n39, n40,
            n41, n42, n43, n44, n45, n46, n47, n48, n49, n50, n51, n52, n53, n54, n55, n56, n57, n58};

        DoublyLinkedList<Nota> list = new DoublyLinkedList<>();
        for (int i = 0; i < notas.length; i++) {
            list.addLast(notas[i]);
        }

        System.out.println("Lista Original");
        Node<Nota> n = list.getFirstNode();
        while (n != null) {
            System.out.println(n.getValue().getNombre() + " " + n.getValue().getValor());
            n = n.getNext();
        }

        System.out.println("Lista Original Invertida");

        Node<Nota> t = list.getLastNode();
        while (t != null) {
            System.out.println(t.getValue().getNombre() + " " + t.getValue().getValor());
            t = t.getPrevious();
        }

        list = insertionSortGenericList(list);

        System.out.println("Lista Ordenada");
        Node<Nota> l = list.getFirstNode();
        while (l != null) {
            System.out.println(l.getValue().getNombre() + " " + l.getValue().getValor());
            l = l.getNext();
        }

        System.out.println("Lista en orden inverso");
        Node<Nota> p = list.getLastNode();
        while (p != null) {
            System.out.println(p.getValue().getNombre() + " " + p.getValue().getValor());
            p = p.getPrevious();
        }

        System.out.println(list.getSize());

    }

}
