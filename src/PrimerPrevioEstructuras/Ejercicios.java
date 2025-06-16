package PrimerPrevioEstructuras;

import edaGenericidad.doublyLinkedListG.*;
import edaGenericidad.queuesG.Queue;

public class Ejercicios {

    public static DoublyLinkedList primerPuntoA(DoublyLinkedList<Integer> l1, DoublyLinkedList<Integer> l2) {
        Node<Integer> currentNode = l2.getFirstNode();
        while (currentNode != null) {
            {
                if (l1.containsNode(currentNode.getValue()) != null) {
                    l1.containsNode(currentNode.getValue()).setValue(0);
                }
                currentNode = currentNode.getNext();
            }

        }
        return l1;
    }

    public static boolean primerPuntoB(DoublyLinkedList<Integer> lGrande, DoublyLinkedList<Integer> lPequena) {
        boolean keepGoing = true;
        Node<Integer> currentNode = lPequena.getFirstNode();
        while (currentNode != null && keepGoing == true) {
            if (!lGrande.contains(currentNode.getValue())) {
                keepGoing = false;
            }
            currentNode = currentNode.getNext();
        }
        return keepGoing;
    }

    public static boolean segundoPunto(DoublyLinkedList<Integer> lSecuencia, DoublyLinkedList<Integer> lSubsecuencia) {

        Node<Integer> currentNode = lSecuencia.getFirstNode();
        while (currentNode != null) {
            Node<Integer> temp = currentNode.getNext();
            if (!lSubsecuencia.contains(currentNode.getValue())) {
                if (temp == null) {
                    break;
                }
                lSecuencia.delete(currentNode.getValue());
            }
            currentNode = temp;
        }
        return lSecuencia.equals(lSubsecuencia);

    }

    public static int tercerPunto(Queue<Integer> queue) {

        int max = -278904547;
        int i = queue.getSize();
        while (i > 0) {
            if (queue.getHead().getValue() > max) {
                max = queue.getHead().getValue();
            }
            queue.enqueue(queue.dequeue());
            i--;
        }

        return max;
    }

}
