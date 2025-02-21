package eda.pkg2025.i.LinkedList;

public class Test {

    public static void main (String[] args){

     
        LinkedList lista = new LinkedList();
        lista.addBegining(5);
        lista.addBegining(2);
        lista.addLast(4);
        

        Node currentNode = lista.getFirstNode();

        while(currentNode != null){
              System.out.println(currentNode.getValue());
              currentNode = currentNode.getNext();
              

        }

        if(lista.exists(2)){
            System.out.println("Elemento existente");
        }
        else{
            System.out.println("El elemento no existe");
        }
        int num = lista.indexOf(2);
        if(num != -1){
            System.out.println(num);
        }
        else{
            System.out.println("Elemento no encontrado");
        }
        
    }
    
}
