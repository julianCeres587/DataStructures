package PrimerPrevioEstructuras;

import edaGenericidad.doublyLinkedListG.*;
import edaGenericidad.queuesG.Queue;

public class Test {
         public static void main(String[] args) {
              DoublyLinkedList<Integer> l1 = new DoublyLinkedList<>();    
              DoublyLinkedList<Integer> l2 = new DoublyLinkedList<>();   
              l1.addLast(1);
              l1.addLast(2);
              l1.addLast(3);
              l1.addLast(4);
              l1.addLast(5);

              l2.addLast(2);
              l2.addLast(4);
              
               Ejercicios e = new Ejercicios();
               e.primerPuntoA(l1, l2);
               l1.printList();




               DoublyLinkedList<Integer> lGrande = new DoublyLinkedList<>();    
               DoublyLinkedList<Integer> lPequena = new DoublyLinkedList<>(); 
               
                lGrande.addLast(1);
                lGrande.addLast(2);
                lGrande.addLast(3);
                lGrande.addLast(4);
                lGrande.addLast(5);
                lGrande.addLast(6);
                lGrande.addLast(7);

                lPequena.addLast(2);
                lPequena.addLast(4);
                lPequena.addLast(6);

                System.out.println(e.primerPuntoB(lGrande, lPequena));

                DoublyLinkedList<Integer> lSecuencia = new DoublyLinkedList<>();    
                DoublyLinkedList<Integer> lSubsecuencia = new DoublyLinkedList<>(); 

                lSecuencia.addLast(5);
                lSecuencia.addLast(1);
                lSecuencia.addLast(22);
                lSecuencia.addLast(25);
                lSecuencia.addLast(6);
                lSecuencia.addLast(-1);
                lSecuencia.addLast(8);
                lSecuencia.addLast(10);

                lSubsecuencia.addLast(1);
                lSubsecuencia.addLast(6);
                lSubsecuencia.addLast(-1);
                lSubsecuencia.addLast(10);

                
 
                 System.out.println(e.segundoPunto(lSecuencia, lSubsecuencia));

                 Queue<Integer> cola = new Queue<>();

                 cola.enqueue(1);
                 cola.enqueue(2);
                 cola.enqueue(3);
                 cola.enqueue(4);
                 cola.enqueue(200005);
                 cola.enqueue(6);
                 System.out.println("Cola Antes de usar metodo");

                 cola.printQueue();
                 System.out.println(e.tercerPunto(cola));
                 System.out.println("Despues de usar metodo");
                 cola.printQueue();
                 
                  


                 
                 


         }
 

    
    
}
