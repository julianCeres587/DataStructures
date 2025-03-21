package Taller21032025;

import java.util.LinkedList;
import java.util.List;



public class CarroCompras {

    List<ItemCompra> items = new LinkedList<ItemCompra>();
   
    public boolean existeItem(int cantidad, Libro libro){
        boolean rta = false;
        
         ItemCompra item = new ItemCompra(cantidad, libro);
         if( items.contains(item)){
            rta = true;
         }
         return rta; 

    }


    public void agregarItem(ItemCompra item){
          items.add(item);
    }

    public void eliminarItem(ItemCompra item){
         items.remove(item);
    }

    public List<ItemCompra> getItems(){
        return this.items;
    }
    
}
