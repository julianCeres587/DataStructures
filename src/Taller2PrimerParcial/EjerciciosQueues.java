package Taller2PrimerParcial;

import java.util.Scanner;

import edaGenericidad.queuesG.*;

public class EjerciciosQueues {

    public static void reorderQueue(Queue<Integer> paramQueue, int value){
          Queue <Integer> queue = paramQueue;
          Node<Integer> currentNode = queue.getHead(); 
          Node<Integer> newHead = new Node<>(value);
          int contador = 0;
          int reference = queue.getSize();
          while(contador != reference){
              if(currentNode.getValue() == value){
                queue.dequeue();
                currentNode = queue.getHead();
                 }
              else{
                queue.enqueue(queue.dequeue());
                currentNode = queue.getHead();
              }
              contador++;
          }
            queue.addBeginning(newHead);
            
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue <Integer> queue = new Queue<>();
        int option;
        int size;
        int i;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Prueba punto 4");
           
            
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  //limpia el buffer para que al usar nextLine tome el valor

            switch (option) {
                case 1:
                    System.out.print("Ingrese la cantidad de elementos: ");
                    size  = scanner.nextInt();
                    i = 0;
                    while(i < size){
                        System.out.print("Ingrese el elemento " + (i+1) + ":");
                        int element  = scanner.nextInt();
                        queue.enqueue(element);
                        i++;
                    }
                    System.out.print("Ingrese el valor para reordenar: ");
                    int value  = scanner.nextInt();
                    System.out.println("Cola Original ");
                    queue.printQueue();
                    reorderQueue(queue,value);
                    System.out.println("Cola Modificada ");
                    queue.printQueue();
                     System.out.println("Size: " + queue.getSize());
                    option = 0;
                    break;
                  }
        } while (option != 0);

        scanner.close();
    }




    
}
