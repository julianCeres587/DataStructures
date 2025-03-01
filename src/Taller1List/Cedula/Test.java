package Taller1List.Cedula;

import java.util.Scanner;

import edaGenericidad.linkedListG.LinkedList;

//Escriba un algoritmo que haciendo
// uso de un arreglo unidimensional de 100
// elementos denominado CEDULA, permita:
// – Leer los 100 elementos por teclado.
// – Ordenar los números de cédula de forma
// ascendente.
// – Buscar si el número de cédula 19144473 se
// encuentra en el arreglo CEDULA e indicar la
// posición que ocupa.
// – Determinar cuántos números de cédula son
// mayores a 19145954.

public class Test {
  
    public static void main(String[] args) {
        int[] numeros = {

            19145900, 19145910, 19145920, 19145930, 19145940, 19145950, 19145960, 19145970, 19145980, 19145990,
            19146000, 19146010, 19146020, 19146030, 19146040, 19146050, 19146060, 19146070, 19146080, 19146090,
            19146100, 19146110, 19146120, 19146130, 19146140, 19146150, 19146160, 19146170, 19146180, 19146190,
            19146200, 19146210, 19146220, 19146230, 19146240, 19146250, 19146260, 19146270, 19146280, 19146290,
            19146300, 19146310, 19146320, 19146330, 19146340, 19146350, 19146360, 19146370, 19146380, 19146390,
            19146400, 19146410, 19146420, 19146430, 19146440, 19146450, 19146460, 19146470, 19146480, 19146490,
            19146500, 19146510, 19146520, 19146530, 19146540, 19146550, 19146560, 19146570, 19146580, 19146590,
            19146600, 19146610, 19146620, 19146630, 19146640, 19146650, 19146660, 19146670, 19146680, 19146690,
            19146700, 19146710, 19146720, 19146730, 19146740, 19146750, 19146760, 19146770, 19146780, 19146790,
            19146800, 19146810, 19146820, 19146830, 19146840, 19146850, 19146860, 19146870, 19146880, 19146890
      };
        // Scanner scanner = new Scanner(System.in);
        // LinkedList <Integer> list = new LinkedList<>();

        // for(int i = 0; i < 100;i++){
        //     System.out.print("Ingrese un número (este es el número" + (i+1)+")");
        //     int numero = scanner.nextInt();
        //     list.addLast(numero);

        // }
        // scanner.close();
        LinkedList <Integer> list = new LinkedList<>();
        for(int i = 0; i < 100;i++){
             
             int numero = numeros[i];
             list.addLast(numero);

         }

        Cedulas c = new Cedulas(list);
        c.ordenar();
        System.out.println("Las cédulas en orden son: ");
        for(int i = 0 ; i < c.getCedulas().getSize();i++){
            System.out.println(c.getCedulas().get(i));
        }
        int existencia = c.existeNumero();

        if(existencia != -1){
            System.out.println("La Cédula 19144473 está en la posición: "+ existencia); //teniendo en cuenta que la posicion es cuando ya está ordenado,sino
        }                                                                               //tocaría llamar la función antes de ordenar
        else{
            System.out.println("La Cédula 19144473 no se encuentra ");
        }
        
        System.out.println("Hay " + c.numerosMayores()+" números mayores que 19145954");
        
    }
  
}
