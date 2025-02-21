package EjerciciosEE.NotasDefinitivas;

public class InsertionSortNota {

     public static Nota[] insertionSortNota(Nota[] array){
        for(int i=0; i<array.length-1;i++){
        
            //si  la primera vez, el numero de la derecha es menor que el inicial
            if(i == 0 && array[i+1].getValor() < array[i].getValor()){
                Nota temp = array[i+1];
                array[i+1] = array[i]; //apunta al otro objeto
                array[i] = temp; 
    
            }
    
            //para el resto de casos, manejar la parte ordenada del arreglo
            //y encontrar la posicion del nuevo elemento
                  if(array[i+1].getValor() < array[i].getValor()){
                       //agregar al inicio
                       for(int j=0;j<i;j++){ //ciclo que se mueve por los elementos ordenados, para encontrar
                                             //la posicion a donde pertenece si se cumple la condicion dada
                              if(array[i+1].getValor() < array[j].getValor()){ //si el numero que se va a agregar es el mas pequeña
                                Nota temp = array[i+1];
                                
                                for(int k=i+1; k>0;k--){
                                    array[k] = array[k-1];
                                }
                                array[0] = temp;
                            }
                              if(array[i+1].getValor() >= array[j].getValor() && array[i+1].getValor() < array[j+1].getValor()){//busca la posicion que corresponde en la parte ordenada
                                Nota temp = array[i+1];             //del arreglo, cuando está en la posicon donde va el elemento, deja de mover a la derecha
                                          //dejando el espacio que requiere y lo inserta
                                int posicion = 0;
                                for(int k = i+1; k> j+1;k--){
                                    array[k] = array[k-1];        //abre espacio en la posicion correspondiente
                                    posicion = k-1;
                                }
                                array[posicion] = temp;
                                } 
                    }
              }
         }
        return array;

 }

 public static void main(String[] args) {
    
    Nota n1 = new Nota(85, "Juan");
        Nota n2 = new Nota(42, "Sofia");
        Nota n3 = new Nota(73, "Pedro");
        Nota n4 = new Nota(96, "Maria");
        Nota n5 = new Nota(15, "Carlos");
        Nota n6 = new Nota(50, "Ana");
        Nota n7 = new Nota(88, "Luis");
        Nota n8 = new Nota(67, "Elena");
        Nota n9 = new Nota(30, "Diego");
        Nota n10 = new Nota(90, "Valeria");
        Nota n11 = new Nota(76, "Fernando");
        Nota n12 = new Nota(62, "Lucia");
        Nota n13 = new Nota(55, "Raul");
        Nota n14 = new Nota(80, "Gabriela");
        Nota n15 = new Nota(20, "Manuel");
        Nota n16 = new Nota(95, "Carmen");
        Nota n17 = new Nota(33, "Esteban");
        Nota n18 = new Nota(70, "Patricia");
        Nota n19 = new Nota(44, "Alberto");
        Nota n20 = new Nota(78, "Paula");
        Nota n21 = new Nota(60, "Jorge");
        Nota n22 = new Nota(89, "Monica");
        Nota n23 = new Nota(22, "Ricardo");
        Nota n24 = new Nota(99, "Beatriz");
        Nota n25 = new Nota(48, "Andres");
        Nota n26 = new Nota(84, "Gloria");
        Nota n27 = new Nota(66, "Rodrigo");
        Nota n28 = new Nota(38, "Veronica");
        Nota n29 = new Nota(45, "Felipe");
        Nota n30 = new Nota(91, "Lorena");
        Nota n31 = new Nota(25, "Oscar");
        Nota n32 = new Nota(74, "Daniela");
        Nota n33 = new Nota(31, "Victor");
        Nota n34 = new Nota(87, "Isabel");
        Nota n35 = new Nota(19, "Samuel");
        Nota n36 = new Nota(98, "Diana");
        Nota n37 = new Nota(41, "Cesar");
        Nota n38 = new Nota(77, "Adriana");
        Nota n39 = new Nota(58, "Hugo");
        Nota n40 = new Nota(69, "Silvia");
        Nota n41 = new Nota(36, "Miguel");
        Nota n42 = new Nota(82, "Cristina");
        Nota n43 = new Nota(47, "Eduardo");
        Nota n44 = new Nota(92, "Rosa");
        Nota n45 = new Nota(53, "Guillermo");
        Nota n46 = new Nota(71, "Natalia");
        Nota n47 = new Nota(27, "Emilio");
        Nota n48 = new Nota(79, "Teresa");
        Nota n49 = new Nota(63, "Francisco");
        Nota n50 = new Nota(86, "Alejandra");
        Nota n51 = new Nota(34, "Ruben");
        Nota n52 = new Nota(94, "Angela");
        Nota n53 = new Nota(21, "Sebastian");
        Nota n54 = new Nota(81, "Vanessa");
        Nota n55 = new Nota(40, "Sergio");
        Nota n56 = new Nota(97, "Camila");
        Nota n57 = new Nota(54, "Eugenio");
        Nota n58 = new Nota(68, "Felicia");

        
        Nota[] notas = { n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20,
                         n21, n22, n23, n24, n25, n26, n27, n28, n29, n30, n31, n32, n33, n34, n35, n36, n37, n38, n39, n40,
                         n41, n42, n43, n44, n45, n46, n47, n48, n49, n50, n51, n52, n53, n54, n55, n56, n57, n58 };

         notas = insertionSortNota(notas);     
         
         for(int i=0; i < notas.length;i++){
            System.out.println("Alumno " + (i+1)+": " + notas[i].getNombre() + "| Nota: " + notas[i].getValor());
         }

 
}


    
}
