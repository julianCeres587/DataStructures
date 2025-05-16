package eda.ABB;

public class TestSegundoPrevio {

    public static void main(String[] args) {
        Arbol arbol1 = new Arbol();
        Arbol arbol2 = new Arbol();

        // Insertar elementos en los árboles
        int[] elementos1 = {50, 30, 70, 20, 40, 60, 80};
        int[] elementos2 = {100, 60, 140, 50, 70, 130, 150};

        for (int num : elementos1) {
            arbol1.agregar(num);
        }

        for (int num : elementos2) {
            arbol2.agregar(num);
        }

        //------------------------Pueba primer punto------------------------

        // Misma Estructura,datos diferentes  debe retornar false
        boolean mismaEstructura = arbol1.sameStructureContent(arbol1.getRaiz(), arbol2.getRaiz());
        System.out.println("\nCaso 1: Misma estructura, datos diferentes ");
        System.out.println("¿Los árboles tienen la misma estructura?: " + mismaEstructura);

        Arbol arbol3 = new Arbol();
        Arbol arbol4 = new Arbol();
        arbol3.agregar(10);
        arbol3.agregar(5);

        arbol4.agregar(10);
        arbol4.agregar(15);
        //Estructura diferente,  debe retornar false
        System.out.println("\nCaso 2: estructuras diferentes ");
        System.out.println("¿Misma estructura y datos?: "
                + arbol3.sameStructure(arbol3.getRaiz(), arbol4.getRaiz()));

        //arbol vacio y arbol con elementos   debe retornar false
        Arbol arbol5 = new Arbol(); // vacío
        Arbol arbol6 = new Arbol();
        arbol6.agregar(1);

        System.out.println("\nCaso 3: uno vacío y otro no ");
        System.out.println("¿Misma estructura y datos?: "
                + arbol5.sameStructureContent(arbol5.getRaiz(), arbol6.getRaiz()));

        Arbol arbol7 = new Arbol();
        Arbol arbol8 = new Arbol();

        arbol7.agregar(10);
        arbol7.agregar(5);
        arbol7.agregar(15);

        arbol8.agregar(10);
        arbol8.agregar(15);
        arbol8.agregar(5);

        //misma estructura, mismos datos
        System.out.println("\nCaso 4: mismos datos ");
        System.out.println("¿Misma estructura y datos?: "
                + arbol7.sameStructureContent(arbol7.getRaiz(), arbol8.getRaiz()));

        Arbol arbol9 = new Arbol();
        Arbol arbol10 = new Arbol();

        arbol9.agregar(1);
        arbol9.agregar(2);
        arbol9.agregar(3);
        arbol9.agregar(4);

        arbol10.agregar(1);
        arbol10.agregar(2);
        arbol10.agregar(3);
        arbol10.agregar(4);

        //misma estructura, mismos datos
        System.out.println("\nCaso 5: Ejemplo hoja 1  ");   //true
        System.out.println("¿Misma estructura y datos?: "
                + arbol9.sameStructureContent(arbol9.getRaiz(), arbol10.getRaiz()));

        Arbol arbol11 = new Arbol();
        Arbol arbol12 = new Arbol();

        arbol11.agregar(1);
        arbol11.agregar(2);
        arbol11.agregar(3);
        arbol11.agregar(4);

        arbol12.agregar(1);
        arbol12.agregar(5);
        arbol12.agregar(3);
        arbol12.agregar(4);

        //misma estructura, mismos datos
        System.out.println("\nCaso 6: Ejemplo hoja 2  ");  //fasle
        System.out.println("¿Misma estructura y datos?: "
                + arbol11.sameStructureContent(arbol11.getRaiz(), arbol12.getRaiz()));

        //------------------------prueba segundo punto----------------------------------

        int[] elementos = {20,10,30,5,15,25,35};
        Arbol arbol = new Arbol();
       
        for (int num : elementos) {
            arbol.agregar(num);
        }

        int min = 10;
        int max = 25;

        System.out.println("\nSumatoria en el rango de " + min + " hasta " + max + " : " + arbol.calcularSumaRango(arbol.getRaiz(), min, max));

    //--------------------Prueaba Tercer Punto------------------------
 
      int[] elementosNuevo = {20,10,30,5,15,25,35};
        Arbol arbolNuevo = new Arbol();
       
        for (int num : elementosNuevo) {
            arbolNuevo.agregar(num);
        }

        int minNuevo = 8;
        int maxNuevo = 18;

       arbolNuevo.agregar(12);
       arbolNuevo.agregar(7);
       arbolNuevo.agregar(17);
       arbolNuevo.agregar(5);
       arbolNuevo.agregar(10);
       arbolNuevo.agregar(15);
       arbolNuevo.agregar(20);


        System.out.println("\nCantidad de hojas dentro del rango de " + minNuevo + " hasta " + maxNuevo + " : " + arbolNuevo.calcularHojasRango(arbolNuevo.getRaiz(), minNuevo, maxNuevo));




    
    
    
    //------------------Prueba Cuarto Punto----------------------------
    // se tiene en cuenta que la altura son el numero de aristas que hay
    //en el camino mas largo  desde la raiz hasta un nodo hoja, aristas, no nodos
       Arbol arbol13 = new Arbol();
        Arbol arbol14 = new Arbol();
        Arbol arbol15 = new Arbol();

        arbol13.agregar(20);
        arbol13.agregar(15);
        arbol13.agregar(24);
        arbol13.agregar(12);

        arbol14.agregar(20);
        arbol14.agregar(15);
        arbol14.agregar(24);
        arbol14.agregar(12);
        arbol14.agregar(23);
        arbol14.agregar(17);
        arbol14.agregar(25);
        arbol14.agregar(16);

        arbol15.agregar(8);

        System.out.println("\nAltura primer arbol : " + arbol13.calcularAltura(arbol13.getRaiz()));
        System.out.println("\nAltura segundo arbol : " + arbol14.calcularAltura(arbol14.getRaiz()));
         System.out.println("\nAltura tercer arbol : " + arbol15.calcularAltura(arbol15.getRaiz()));

        // // 3. Probar printRange
        // System.out.println("\nElementos entre 35 y 75 en arbol1:");
        // arbol1.printRange(35, 75, arbol1.getRaiz());
        // // 4. Probar inOrderList
        // System.out.println("\nLista con recorrido Ordenado:");
        // LinkedList<Integer> lista = new LinkedList<>();
        // lista = arbol1.inOrderList(arbol1.getRaiz(), lista);
        // for (Integer val : lista) {
        //     System.out.print(val + " ");
        // }
        // System.out.println();
        // System.out.println("Contiene el numero 12: " + arbol1.contains(12,arbol1.getRaiz()));
        // System.out.println("Contiene el numero 80: " + arbol1.contains(80,arbol1.getRaiz()));
    }
}
