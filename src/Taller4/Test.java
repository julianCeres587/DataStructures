package Taller4;

import edaGenericidad.doublyLinkedListG.DoublyLinkedList;

public class Test {
       public static void main(String[] args) {
        Taller t = new Taller();
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
       System.out.println("Prueba punto 1  \n"  );
        list.addLast(4);
        list.addLast(6);
        list.addLast(3);
        list.addLast(1);
        list.addLast(4);
        list.addLast(8);
        list.addLast(10);
        list.addLast(12);
        list.addLast(23);
        System.out.println("Lista Antes");
        list.printList();
        DoublyLinkedList<Integer> listNow = t.punto1(50,list);
        System.out.println("Lista Despúes");
        listNow.printList();

        System.out.println("Prueba punto 2 \n");
 
        DoublyLinkedList<Integer> list2 =  new DoublyLinkedList<>();
        list2.addLast(3);
        list2.addLast(5);
        list2.addLast(4);
        list2.addLast(7);
        list2.addLast(9);
        list2.addLast(10);
        list2.addLast(9);
        list2.addLast(2);

        list2.printList();

        float[] test2 = t.punto2(list2);
        
        System.out.println("Promedio : " + test2[0]);
        System.out.println("Elementos Mayores Al Promedio : " + (int)test2[1]);
        System.out.println("Suma Números Pares : " + (int)test2[2]);
        System.out.println("Suma Números Impares : " + (int)test2[3]);

        System.out.println("Prueba Punto 3 \n");

        DoublyLinkedList<Integer> list3 =  new DoublyLinkedList<>();
        DoublyLinkedList<Integer> list4 =  new DoublyLinkedList<>();
        
        list3.addLast(4);
        list4.addLast(1);
        list3.addLast(6);
        list4.addLast(2);
        list3.addLast(7);
        list4.addLast(3);
        list3.addLast(3);
        list4.addLast(7);
        list3.addLast(2);
        list4.addLast(6);
        list3.addLast(1);
        list4.addLast(4);
        
       

        System.out.println("Primera Lista: ");
        list3.printList();
        System.out.println("Segunda Lista");
        list4.printList();

        System.out.println("Listas Iguales : " + t.listsAreEquals(list3,list4));
      
      }
      
    
}
