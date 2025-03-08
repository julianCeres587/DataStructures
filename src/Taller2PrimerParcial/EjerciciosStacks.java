package Taller2PrimerParcial;


import java.util.Scanner;

import edaGenericidad.stacksG.*;



public class EjerciciosStacks<E> {

       public static void replace(Stack<Integer> stack, int newValue, int old){
                Stack<Integer> mainStack = stack;
                Stack<Integer> auxStack = new Stack<>();
                Node<Integer> currentNode = mainStack.getTop();
                boolean find = false;
                
                while(currentNode != null && find == false ){
                    if(currentNode.getValue() == old){
                        currentNode.setValue(newValue);
                        find = true;
                    }
                    else{
                        auxStack.push(mainStack.pop());
                        currentNode = mainStack.getTop();
                    }

                 }
                    while(!auxStack.isEmpty()){
                        mainStack.push(auxStack.pop());
                    }
                 
                 
         }      

         public static void smallerToDeepest(Stack<Integer> stack){
            Stack<Integer> mainStack = stack;
            Stack<Integer> auxStack = new Stack<>();
            Node<Integer> currentNode = mainStack.getTop();
           
            int menor = currentNode.getValue();
            int reference = mainStack.getSize();
            while(auxStack.getSize()!=reference){
                if(menor > currentNode.getValue()){
                    menor = currentNode.getValue();
                }
                if(mainStack.getTop() != null){
                    auxStack.push(mainStack.pop());
                    currentNode = mainStack.getTop();
                }
               }
               
               mainStack.push(menor);
               while(!auxStack.isEmpty()){
                  if(auxStack.getTop().getValue() != menor){
                    mainStack.push(auxStack.pop());
                  }
                  else{
                    auxStack.pop();
                  }
                  }

            
     }    

     public static void reorderStack(Stack<Integer> stack, int value){
        Stack<Integer> mainStack = stack;
        Stack<Integer> auxStack = new Stack<>();
        Node<Integer> currentNode = mainStack.getTop();
        boolean find = false;
        int newTop = value;
       
        while(currentNode != null && find == false ){
            if(currentNode.getValue() == value){
                 newTop = mainStack.pop();
                find = true;
                }
            else{
                auxStack.push(mainStack.pop());
                currentNode = mainStack.getTop();
            }
         }

           while(!auxStack.isEmpty()){
            mainStack.push(auxStack.pop());
          }
            mainStack.push(newTop);
           
         }


         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack <Integer > stack = new Stack<>();
        int option;
        int size;
        int i;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Prueba punto 1");
            System.out.println("2.  Prueba punto 2");
            System.out.println("3.  Prueba punto 3");
            
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
                        stack.push(element);
                        i++;
                    }
                    System.out.print("Ingrese el valor a reemplazar: ");
                    int old  = scanner.nextInt();
                    System.out.print("Ingrese el valor que reemplazará al anterior: ");
                    int newValue  = scanner.nextInt();
                    System.out.println("Pila Original ");
                    stack.printStack();
                    replace(stack,newValue,old);
                    System.out.println("Pila Modificada ");
                    stack.printStack();
                     System.out.println("Size: " + stack.getSize());
                    option = 0;
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad de elementos: ");
                    size  = scanner.nextInt();
                     i = 0;
                    while(i < size){
                        System.out.print("Ingrese el elemento: " + (i+1) + ":");
                        int element  = scanner.nextInt();
                        stack.push(element);
                        i++;
                    }
                    
                    System.out.println("Pila Original ");
                    stack.printStack();
                    smallerToDeepest(stack);
                    System.out.println("Pila Modificada ");
                    stack.printStack();
                     System.out.println("Size: " + stack.getSize());
                    option = 0;
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad de elementos: ");
                    size  = scanner.nextInt();
                    i = 0;
                    while(i < size){
                        System.out.print("Ingrese el elemento: " + (i+1) + ":");
                        int element  = scanner.nextInt();
                        stack.push(element);
                        i++;
                    }
                    System.out.print("Ingrese el valor para reordenar: ");
                    int value  = scanner.nextInt();
                    System.out.println("Pila Original ");
                    stack.printStack();
                    reorderStack(stack, value);
                    System.out.println("Pila Modificada ");
                    stack.printStack();
                    System.out.println("Size: " + stack.getSize());
                    option = 0;
                    break;
                    

                
            }
        } while (option != 0);

        scanner.close();
    }
}    
     
     





    
    

