package Taller4;

import SortingAlgorithms.InsertionSortGenericList;
import edaGenericidad.doublyLinkedListG.DoublyLinkedList;
import edaGenericidad.doublyLinkedListG.Node;

public class Taller {

    public Taller() {

    }

    public DoublyLinkedList<Integer> punto1(int target, DoublyLinkedList<Integer> list) {
        DoublyLinkedList<Integer> sorted;
        if (exist(target, list)) {
            sorted = InsertionSortGenericList.insertionSortGenericList(list);
        } else {
            sorted = InsertionSortGenericList.insertionSortGenericList(list);
            sorted.addLast(target);
        }

        return sorted;
    }

    public boolean exist(int element, DoublyLinkedList<Integer> list) {
        Node<Integer> currentNode = list.getFirstNode();
        boolean found = false;
        while (currentNode != null && found == false) {
            int value = currentNode.getValue();
            if (value == element) {
                found = true;
            }
            currentNode = currentNode.getNext();
        }
        return found;

    }

    public float[] punto2(DoublyLinkedList<Integer> list) {
        float average;
        int higherThanAverage = 0;
        int evenSum = 0;
        int oddSum = 0;
        average = getAverage(list);
        Node<Integer> currentNode = list.getFirstNode();
        while (currentNode != null) {
            int value = currentNode.getValue();
            if (value % 2 == 0) {
                evenSum++;
            } else {
                oddSum++;
            }
            if (value > average) {
                higherThanAverage++;
            }
            currentNode = currentNode.getNext();
        }
        float[] rta = new float[4];
        rta[0] = average;
        rta[1] = (float) higherThanAverage;
        rta[2] = (float) evenSum;
        rta[3] = (float) oddSum;
        return rta;
    }

    public float getAverage(DoublyLinkedList<Integer> list) {
        float average = 0;
        Node<Integer> currentNode = list.getFirstNode();
        while (currentNode != null) {
            average += currentNode.getValue();
            currentNode = currentNode.getNext();
        }
        average = average / list.getSize();
        return average;
    }

    public boolean listsAreEquals(DoublyLinkedList<Integer> list1, DoublyLinkedList<Integer> list2) {
        boolean areEquals = false;
        boolean stopComparing = false;
        if (list1.getSize() == list2.getSize()) {
            Node<Integer> currentNode1 = list1.getFirstNode();
            Node<Integer> currentNode2 = list2.getFirstNode();
            while (stopComparing == false && currentNode1 != null) {
                int value1 = currentNode1.getValue();
                int value2 = currentNode2.getValue();
                if (value1 != value2) {
                    stopComparing = true;
                }
                currentNode1 = currentNode1.getNext();
                currentNode2 = currentNode2.getNext();
            }
            if (stopComparing == false) {
                areEquals = true;
            }

        }
        return areEquals;

    }

}
