package Taller21032025;

import java.util.Comparator;
import java.util.Objects;

//import java.util.Objects;

public class Libro implements Comparator {

    String titulo;
    String isbn;
    int precio;

    public Libro() {

    }

    public Libro(String titulo, String isbn, int precio) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
    }


    
    @Override
    public boolean equals(Object libro){
         boolean rta = false;
         if(libro instanceof Libro){
            Libro lib = (Libro)libro;
            if(this.isbn == lib.getIsbn()){
                rta = true;
            }
         }
         return rta;
         
    }

     @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
 
   

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }

}
