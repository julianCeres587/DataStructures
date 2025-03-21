package Taller21032025;

import java.util.Comparator;

public class ItemCompra implements Comparator {

    Libro libro = new Libro();
    int cantidad;

    public ItemCompra() {

    }

    @Override
    public boolean equals(Object item){
        boolean rta = false;
        if(item instanceof ItemCompra){
            ItemCompra it = (ItemCompra)item;
            if(this.libro.getIsbn() == it.getLibro().getIsbn()){
               rta = true;
           }
        }
        return rta;
        
   }

    

    public ItemCompra( int cantidad , Libro libro) {
        this.libro = libro;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public Libro getLibro() {
        return this.libro;
    }

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }
    

}
