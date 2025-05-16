package TetsPrev1;

public class perro {
     int num;
     String sonido;
     public perro(final int num, final String sonido) {
        this.num = num;
        this.sonido = sonido;
    }
     public perro() {
    }
     public int getNum() {
         return num;
     }
     public void setNum(final int num) {
         this.num = num;
     }
     public String getSonido() {
         return sonido;
     }
     public void setSonido(final String sonido) {
         this.sonido = sonido;
     }
     @Override
     public String toString() {
        return "perro [num=" + num + ", sonido=" + sonido + "]";
     }

    
}
