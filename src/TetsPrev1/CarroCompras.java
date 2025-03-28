package TetsPrev1;

import edaGenericidad.doublyLinkedListG.DoublyLinkedList;
import edaGenericidad.doublyLinkedListG.Node;

public class CarroCompras {

    private final DoublyLinkedList<ItemCompra> items = new DoublyLinkedList<>();
   
    public boolean existeItem(int cantidad, Libro libro){
        boolean rta = false;
        
         ItemCompra item = new ItemCompra(cantidad, libro);
         if(items.contains(item)){
            rta = true;
         }
         return rta; 

    }

    public int getPrecioTotal(){
        int salida = 0;
        Node<ItemCompra> currentNode = items.getFirstNode();
        while(currentNode != null){
               salida += currentNode.getValue().getLibro().getPrecio() * currentNode.getValue().getCantidad();
               currentNode = currentNode.getNext();
            }
        
        return salida;
    }


    public void agregarItem(ItemCompra item){
          items.addLast(item);
    }

    public void eliminarItem(ItemCompra item){
         items.delete(item);
    }

    public DoublyLinkedList<ItemCompra> getItems(){
        return this.items;
    }
    
}
