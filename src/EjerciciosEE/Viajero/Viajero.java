package EjerciciosEE.Viajero;

//El primer metodo que se debe ejecutar es calcularGastos

public class Viajero {
    private int gastosComida;
    private int gastosHospedaje;
    private  int gastosTransporte;
    private int gastosRopa;
    private int cantidadGastosComida;

    Gastos[] gastos;

    public Viajero(){
       
    }

    public Viajero(Gastos[] array){
       this.gastos = array; 
    }

    public void calcularGastos(){
        int comida = 0;
        int transporte = 0;
        int hospedaje = 0;
        int ropa = 0;
        this.cantidadGastosComida = 0;
         for(int i = 0; i < gastos.length; i++){
             if(gastos[i] instanceof Transporte){
                 transporte += gastos[i].getValor();
             }
             if(gastos[i] instanceof Hospedaje){
                hospedaje += gastos[i].getValor();
            }
            if(gastos[i] instanceof Comida){
                comida += gastos[i].getValor();
                this.cantidadGastosComida++;
            }
            if(gastos[i] instanceof Ropa){
                ropa += gastos[i].getValor();
            }
          }
          this.gastosComida = comida;
          this.gastosRopa = ropa;
          this.gastosHospedaje = hospedaje;
          this.gastosTransporte = transporte;
          
    }

    public int getCantidadGastosComida(){
        return this.cantidadGastosComida;
    }

    public String mayorTipoDeGasto(){
        int[] gastosTipo = {this.gastosComida,this.gastosHospedaje,this.gastosTransporte,this.gastosRopa};
        int mayor = 0;
        for(int i = 0; i < gastosTipo.length; i++){
            if(gastosTipo[i] > mayor){
              mayor = gastosTipo[i];
            }
         }
         if(mayor == gastosComida){
            return "El tipo de gasto en el que más se invirtió durante el viaje fue COMIDA";
         }
         if(mayor == gastosHospedaje){
             return "El tipo de gasto en el que más se invirtió durante el viaje fue HOSPEDAJE";
         }
         if(mayor == gastosTransporte){
             return "El tipo de gasto en el que más se invirtió durante el viaje fue TRANSPORTE";
         }
         if(mayor == gastosRopa){
             return "El tipo de gasto en el que más se invirtió durante el viaje fue ROPA";
         }
         return "";
     }

     public int getGastosComida(){
        return this.gastosComida;
    }

    public int getGastosHospedaje(){
        return this.gastosHospedaje;
    }

    public int getGastosTransporte(){
        return this.gastosTransporte;
    }

    public int getGastosRopa(){
        return this.gastosRopa;
    }

    public void setGastosComida(int gastosComida){
        this.gastosComida = gastosComida ;
    }

    public void setGastosHospedaje(int gastosHospedaje){
        this.gastosHospedaje = gastosHospedaje;
    }

    public void setGastosTransporte(int gastosTransporte){
        this.gastosTransporte = gastosTransporte;
    }

    public void setGastosRopa(int gastosRopa){
         this.gastosRopa = gastosRopa;
    }

    

    
}
