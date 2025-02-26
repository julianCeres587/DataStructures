package edaGenericidad.doublyLinkedListG;

import java.util.Scanner;

public class Test {
    

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        int option;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Agregar por índice");
            System.out.println("4. Eliminar por índice");
            System.out.println("5. Obtener valor por índice");
            System.out.println("6. Buscar índice de un valor");
            System.out.println("7. Verificar si contiene un valor");
            System.out.println("8. Imprimir lista");
            System.out.println("9. Imprimir lista en reversa");
            System.out.println("10. Limpiar lista");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  //limpia el buffer para que al usar nextLine tome el valor

            switch (option) {
                case 1:
                    System.out.print("Ingrese el valor: ");
                    String value1 = scanner.nextLine();
                    list.addBeginning(value1);
                    list.printList();
                    System.out.println("Size: " + list.getSize());
                    break;
                case 2:
                    System.out.print("Ingrese el valor: ");
                    String value2 = scanner.nextLine();
                    list.addLast(value2);
                    list.printList();
                    System.out.println("Size: " + list.getSize());
                    break;
                case 3:
                    System.out.print("Ingrese el índice: ");
                    int index3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el valor: ");
                    String value3 = scanner.nextLine();
                    list.addByindex(index3, value3);
                    list.printList();
                    System.out.println("Size: " + list.getSize());
                    break;
                case 4:
                    System.out.print("Ingrese el índice a eliminar: ");
                    int index4 = scanner.nextInt();
                    scanner.nextLine();
                    list.deleteByIndex(index4);
                    list.printList();
                    System.out.println("Size: " + list.getSize());
                    break;
                case 5:
                    System.out.print("Ingrese el índice: ");
                    int index5 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Valor: " + list.get(index5));
                    list.printList();
                    System.out.println("Size: " + list.getSize());
                    break;
                case 6:
                    System.out.print("Ingrese el valor a buscar: ");
                    String value6 = scanner.nextLine();
                    System.out.println("Índice: " + list.indexOf(value6));
                    list.printList();
                    System.out.println("Size: " + list.getSize());
                    break;
                case 7:
                    System.out.print("Ingrese el valor a verificar: ");
                    String value7 = scanner.nextLine();
                    boolean print =  list.contains(value7);
                    if(print){
                        System.out.println("Existe: " + print);
                        
                    }
                    else{
                        System.out.println("No existe");
                        
                    }
                    
                    list.printList();
                    System.out.println("Size: " + list.getSize());
                    break;
                case 8:
                    list.printList();
                    System.out.println("Size: " + list.getSize());
                    break;
                case 9:
                    list.printReverseList();
                    System.out.println("Size: " + list.getSize());
                    break;
                case 10:
                    list.clear();
                    System.out.println("Lista vaciada.");
                    System.out.println("Size: " + list.getSize());
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
