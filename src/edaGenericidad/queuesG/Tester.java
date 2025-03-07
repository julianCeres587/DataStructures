package edaGenericidad.queuesG;

import java.util.Scanner;



    public class Tester {

    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue <String> queue = new Queue<>();
        int option;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
        
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  //limpia el buffer para que al usar nextLine tome el valor

            switch (option) {
                case 1:
                    System.out.print("Ingrese el valor: ");
                    String value1 = scanner.nextLine();
                    queue.enqueue(value1);
                    queue.printQueue();
                    System.out.println("Size: " + queue.getSize());
                    break;
                case 2:
                   
                    
                    String s = queue.dequeue();
                    queue.printQueue();
                    System.out.println("Size: " + queue.getSize() + " Eliminado: " + s);
                    break;
                

                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 0);

        scanner.close();
    
    
}
    
}

