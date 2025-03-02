package SortingAlgorithms;
import edaGenericidad.linkedListG.*;
//import EjerciciosEE.NotasDefinitivas.*;

import EjerciciosEE.NotasDefinitivas.Nota;


//the method getValor must be implementes into the type of objet that we're going to sort

public class InsertionSortListObj {

    

     public static LinkedList<Nota> insertionSortNota(LinkedList<Nota> list){
        for(int i=0; i<list.getSize()-1;i++){
        
            //si  la primera vez, el numero de la derecha es menor que el inicial
            if(i == 0 && list.get(i+1).getValor() < list.get(i).getValor()){
                Nota temp = list.get(i+1);
                list.getNode(i+1).setValue(list.get(i)); //apunta al otro objeto
                list.getNode(i).setValue(temp); 
    
            }
    
            //para el resto de casos, manejar la parte ordenada del arreglo
            //y encontrar la posicion del nuevo elemento
                  if(list.get(i+1).getValor() < list.get(i).getValor()){
                       //agregar al inicio
                       for(int j=0;j<i;j++){ //ciclo que se mueve por los elementos ordenados, para encontrar
                                             //la posicion a donde pertenece si se cumple la condicion dada
                              if(list.get(i+1).getValor() < list.get(j).getValor()){ //si el numero que se va a agregar es el mas pequeña
                                Nota temp = list.get(i+1);
                                
                                for(int k=i+1; k>0;k--){
                                    list.getNode(k).setValue(list.get(k-1)); 
                                }
                                list.getFirstNode().setValue(temp);
                            }
                              if(list.get(i+1).getValor() >= list.get(j).getValor() && list.get(i+1).getValor() < list.get(j+1).getValor()){//busca la posicion que corresponde en la parte ordenada
                                Nota temp = list.get(i+1);             //del arreglo, cuando está en la posicon donde va el elemento, deja de mover a la derecha
                                          //dejando el espacio que requiere y lo inserta
                                int posicion = 0;
                                for(int k = i+1; k> j+1;k--){
                                    list.getNode(k).setValue(list.get(k-1)); //abre espacio en la posicion correspondiente
                                    posicion = k-1;
                                }
                                list.getNode(posicion).setValue(temp);
                                } 
                    }
              }
         }
        return list;

 }
    


public static void main(String[] args) {
    
        Nota n1 = new Nota(18, "Juan");
Nota n2 = new Nota(10, "Sofia");
Nota n3 = new Nota(12, "Pedro");
Nota n4 = new Nota(20, "Maria");
Nota n5 = new Nota(6, "Carlos");
Nota n6 = new Nota(14, "Ana");
Nota n7 = new Nota(19, "Luis");
Nota n8 = new Nota(15, "Elena");
Nota n9 = new Nota(5, "Diego");
Nota n10 = new Nota(17, "Valeria");
Nota n11 = new Nota(13, "Fernando");
Nota n12 = new Nota(11, "Lucia");
Nota n13 = new Nota(8, "Raul");
Nota n14 = new Nota(16, "Gabriela");
Nota n15 = new Nota(7, "Manuel");
Nota n16 = new Nota(20, "Carmen");
Nota n17 = new Nota(4, "Esteban");
Nota n18 = new Nota(15, "Patricia");
Nota n19 = new Nota(9, "Alberto");
Nota n20 = new Nota(14, "Paula");
Nota n21 = new Nota(13, "Jorge");
Nota n22 = new Nota(19, "Monica");
Nota n23 = new Nota(3, "Ricardo");
Nota n24 = new Nota(18, "Beatriz");
Nota n25 = new Nota(12, "Andres");
Nota n26 = new Nota(17, "Gloria");
Nota n27 = new Nota(10, "Rodrigo");
Nota n28 = new Nota(8, "Veronica");
Nota n29 = new Nota(9, "Felipe");
Nota n30 = new Nota(20, "Lorena");
Nota n31 = new Nota(5, "Oscar");
Nota n32 = new Nota(14, "Daniela");
Nota n33 = new Nota(6, "Victor");
Nota n34 = new Nota(19, "Isabel");
Nota n35 = new Nota(3, "Samuel");
Nota n36 = new Nota(20, "Diana");
Nota n37 = new Nota(7, "Cesar");
Nota n38 = new Nota(16, "Adriana");
Nota n39 = new Nota(11, "Hugo");
Nota n40 = new Nota(12, "Silvia");
Nota n41 = new Nota(4, "Miguel");
Nota n42 = new Nota(18, "Cristina");
Nota n43 = new Nota(9, "Eduardo");
Nota n44 = new Nota(19, "Rosa");
Nota n45 = new Nota(8, "Guillermo");
Nota n46 = new Nota(15, "Natalia");
Nota n47 = new Nota(6, "Emilio");
Nota n48 = new Nota(16, "Teresa");
Nota n49 = new Nota(10, "Francisco");
Nota n50 = new Nota(17, "Alejandra");
Nota n51 = new Nota(5, "Ruben");
Nota n52 = new Nota(18, "Angela");
Nota n53 = new Nota(2, "Sebastian");
Nota n54 = new Nota(14, "Vanessa");
Nota n55 = new Nota(7, "Sergio");
Nota n56 = new Nota(20, "Camila");
Nota n57 = new Nota(8, "Eugenio");
Nota n58 = new Nota(13, "Felicia");
    
            
            Nota[] notas = { n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20,
                             n21, n22, n23, n24, n25, n26, n27, n28, n29, n30, n31, n32, n33, n34, n35, n36, n37, n38, n39, n40,
                             n41, n42, n43, n44, n45, n46, n47, n48, n49, n50, n51, n52, n53, n54, n55, n56, n57, n58 };
            
            LinkedList <Nota> list = new LinkedList<>();
            for(int i = 0; i < notas.length;i++){
               list.addLast(notas[i]);
            }

            System.out.println("List before sorting");

            for(int i = 0; i < list.getSize(); i++){
                System.out.println(list.get(i).getValor() + list.get(i).getNombre());
            }

           LinkedList <Nota> resultado = insertionSortNota(list);
           System.out.println("List after sorting");

           for(int i = 0; i < resultado.getSize(); i++){
            System.out.println(resultado.get(i).getValor() + resultado.get(i).getNombre());
        }


            
     
    }


}
