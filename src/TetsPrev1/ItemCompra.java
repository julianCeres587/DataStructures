package TetsPrev1;

public class ItemCompra {

    private Libro libro = new Libro();
    private int cantidad;

    public ItemCompra() {

    }

    public ItemCompra(int cantidad, Libro libro) {
        this.libro = libro;
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj instanceof ItemCompra) {
            ItemCompra it = (ItemCompra) obj;
            if (this.libro.getIsbn().equals(it.getLibro().getIsbn())) {
                rta = true;
            }
        }
        return rta;

    }

    public int getCantidad() {
        return this.cantidad;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public int getValorItem() {
        return libro.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Libro: " + this.libro.getTitulo() + " Cantidad: " + this.cantidad + " Precio: " + getValorItem();
    }

}
