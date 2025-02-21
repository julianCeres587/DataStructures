package Taller1.NumeroRepetido;

//Una matriz contiene n números que van desde 0 a n-2. Hay
// exactamente un número que se repite en la matriz. Necesitas escribir
// un programa para encontrar el numero duplicado. Por ejemplo, si una
// matriz con longitud 5 contiene números {0, 3, 1, 2, 3}, entonces el
// número duplicado es 3.

public class NumeroRepetido {
     public static int encontrarDuplicado(int[]array){
       int repetido = -1;
       for(int i=0;i<array.length;i++){
           for(int j = 0; j < array.length; j++){
             if(i!=j && array[i] == array[j]){
                repetido = array[i];
                return repetido;
             }
           }
           }
       return repetido;
     }   
 
     public static int encontrarDuplicado2(int[]array){
        int[] arregloAuxiliar = new int[array.length];
        //como los elementos van dados desde 0 a n-2, se pueden usar como indices
        //(no van a sobrepasar el tamaño del arreglo), con ello, se puede marcar con 
        //un valor especifico la posicion(-1 ya que van del 0 a n-2) y cuando se encuentre ese valor
        // en el arregloAuxiliar, significa que ya se pasó por esa posicion, que es en realidad un número
        //y por tanto, esa posición es el número repetido
        int repetido = -1;
        for(int i = 0; i < array.length && repetido == -1; i++){
           
            if(arregloAuxiliar[array[i]] != -1){
                arregloAuxiliar[array[i]] = -1;
            }else{
                repetido = array[i];
            }
            
            
        }
        return repetido;
}


     public static void main(String[] args) {
        int[] numeros =  {0, 1, 2, 3, 4, 5,4};
        int resultado = encontrarDuplicado2(numeros);
        if(resultado != -1){
            System.out.println("El número repetido es : " + resultado);
        }
        else{
            System.out.println("No hay repetidos");
        }
            
        
    }
     
}

