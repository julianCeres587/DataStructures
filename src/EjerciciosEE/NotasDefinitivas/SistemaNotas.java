package EjerciciosEE.NotasDefinitivas;

import java.text.DecimalFormat;

import AlgoritmosDeBsqueda.BusquedaBinariaM;


//lo primero que se debe hacer es ordenar las notas, los calculos toman el arreglo como ordenado

public class SistemaNotas {

   private Nota[] notas;
   private double notaPromedio;
   private int[] arrNums;
  
   public SistemaNotas(){

   }

   public SistemaNotas(Nota[] notas){
     this.notas = notas;
   }

   public void ordenarNotas(){
      this.notas = InsertionSortNota.insertionSortNota(this.notas);

   }

 //ordenar notas primero
   public double calcularNotaPromedio(){
      double sumatoriaNotas = 0;
      arrNums = new int[notas.length];
      for(int i = 0; i < notas.length; i++){
          sumatoriaNotas += notas[i].getValor();
          arrNums[i] = notas[i].getValor();
      }
      this.notaPromedio = sumatoriaNotas / notas.length;
      return notaPromedio;
   }

   
   
   

   public int puntajesMayores17(){  
        boolean pivoteEncontrado = false;
        int posicion = -1;     //con el ciclo aseguramos encontrar numero menor a 18
        int objetivo = 17;
        int cantidadPuntajes = -1;
        while(pivoteEncontrado==false && objetivo > 0){
               posicion = BusquedaBinariaM.busquedaBinariaM(arrNums,objetivo);
               if( posicion != -1){                                                //lo encontró
                 pivoteEncontrado = true;
               }
              else{
                  objetivo--;
               }
           }
        cantidadPuntajes = notas.length - (posicion+1);    //posicion sale con un valor del cilo, si no hay menores a
        return cantidadPuntajes;                           //a 18 todos son mayores
      }

   public int notasMayoresPromedio(){
      int contador = 0;
        for(int i = 0; i < notas.length; i++){
         if(notas[i].getValor() > notaPromedio){
              contador++;
         }
        }
      return contador;
     }  
     //asumiendo que se aprueba con 12, repetimos lo del metodo de puntajes mayores a 17, con mayores a 11
   public String porcentajeAprobados(){
      
      boolean pivoteEncontrado = false;
      int posicion = -1;
      int objetivo = 11;
      double cantidadAprobados = -1;
      double cantidadReprobados = -1;
      while(pivoteEncontrado==false && objetivo > 0){
             posicion = BusquedaBinariaM.busquedaBinariaM(arrNums,objetivo);
             if( posicion != -1){                                                //lo encontró
               pivoteEncontrado = true;
             }
            else{
                objetivo--;
             }
         }
      cantidadAprobados = notas.length - (posicion+1);   
      cantidadReprobados = notas.length - cantidadAprobados;
      double porcentajeAprobados =  (cantidadAprobados * 100) / (double)notas.length;
      double porcentajeReprobados = (cantidadReprobados * 100) / (double)notas.length;  

      DecimalFormat df = new DecimalFormat("#.##");

      
      
      
      String porcentajeAprobadosS = df.format(porcentajeAprobados );
      String porcentajeReprobadosS = df.format(porcentajeReprobados );
      
      return ("Porcentaje Aprobados = "+porcentajeAprobadosS +
              "% | Porcentaje Reprobados = " + porcentajeReprobadosS+"%");
      }
      
   public Nota[] getNotas(){
       return this.notas;
     }
   }


