package EjerciciosEE.NotasDefinitivas;

public class Nota implements Comparable<Nota> {

    private int valor;
    private String nombre;

    public Nota(){

    }

    public Nota(int valor, String nombre){
     this.valor = valor;
     this.nombre = nombre;
    }
    
    public int getValor(){
        return this.valor;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public int compareTo(Nota otra) {
        return this.valor - otra.getValor();
    }

    
}
