package Taller21032025;

import java.util.LinkedList;
import java.util.List;

public class TiendaLibros {

    
    private  List <Libro> catalogo = new LinkedList<Libro>();
    private  CarroCompras carro = new CarroCompras();


    public void agregarLibro(Libro libro){
       catalogo.add(libro);

    }

    public boolean agregarCarro(int cantidad, Libro libro){
        boolean rta = false;
        if(existeLibro(libro)){
            ItemCompra item = new ItemCompra(cantidad, libro);
            carro.agregarItem(item);
            rta = true;
        }
        return rta;
        

    }

    public boolean retirarCarro(Libro libro){
        boolean rta = false;
        if(carro.existeItem(0, libro)){
            ItemCompra item = new ItemCompra(0, libro);
            carro.eliminarItem(item); // ver como funciona internamente el metodo de eliminar
            rta = true;
        }
        return rta;
        
    }

    public boolean existeLibro(Libro libro){
        if(catalogo.contains(libro)){
            return true;
        }
        return false;
    }

    public List<Libro> getCatalogo(){
        return this.catalogo;
    }

    public CarroCompras getCarro(){
        return this.carro;
    }


    
}
