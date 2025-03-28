package TetsPrev1;

public class Libro {

    private String titulo;
    private String isbn;
    private int precio;

    public Libro() {

    }

    public Libro(String titulo, String isbn, int precio) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            Libro lib = (Libro)obj;
            return this.isbn.equals(lib.getIsbn());
        }
        return false;
    }
    
    //  @Override
    // public int hashCode() {
    //     return Objects.hash(isbn);  //obtener codigo hash de la propiedad que se va a comparar
    // }
    

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
    public String toString() {
        return "Libro: " + this.titulo + " Isbn: " + this.isbn + " Precio: " + precio;
    }

 

}
