package Recursividad.stacksRecursive;

import java.util.Scanner;

public class Test {

    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int option;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Apilar");
            System.out.println("2. Desapilar");
            System.out.println("3. Hallar Menor");
            System.out.println("4. Desapilar Recursivo");
            System.out.println("5. Pila de Pares");
        
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  //limpia el buffer para que al usar nextLine tome el valor

            switch (option) {
                case 1:
                    System.out.print("Ingrese el valor: ");
                    int value1 = scanner.nextInt();
                    stack.push(value1);
                    stack.printStack();
                    System.out.println("Size: " + stack.getSize());
                    break;
                case 2:
                   
                    
                    int s = stack.pop();
                    stack.printStack();
                    System.out.println("Size: " + stack.getSize() + " Eliminado: " + s);
                    break;

                    case 3:
                   
                    //realizar copia de la pila, esa copia la envia como parametro para que no se pierda
                    Stack<Integer> copyStack = stack.copyOf();
                    int n = stack.minValueRecursive(copyStack,copyStack.getTop().getValue());
                    System.out.println("El elemento menor es : " +n);
                    stack.printStack();
                    System.out.println("Size: " + stack.getSize() );
                    
                    break;

                    case 4:
                      stack.recursiveUnstack(stack);
                    break;

                    case 5:
                      Stack <Integer> evenStack = stack.evenElements(stack.copyOf());
                    stack.printStack();
                    System.out.println("Size: " + stack.getSize() );
                    evenStack.printStack();
                    System.out.println("Even Numbers: " + evenStack.getSize() );

                     
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
