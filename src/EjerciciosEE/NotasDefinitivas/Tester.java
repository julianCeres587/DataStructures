package EjerciciosEE.NotasDefinitivas;

// Se han registrado las notas definitivas
// de 58 estudiantes de Programación Digital en
// un arreglo unidimensional llamado NOTAS. Cada
// calificación es un número entero entre 1 y
// 20.Construya un algoritmo que le permita al profesor de
// esta asignatura obtener la siguiente información:
// – La nota promedio de la clase.
// – Las notas ordenadas de menor a mayor.
// – Nota más alta y más baja obtenida en esta sección de Programación Digital, e
// indicar los nombres de los estudiantes que las obtuvieron.
// – Cuántos estudiantes obtuvieron notas de 18, 19 ó 20.
// – Las notas que fueron mayores al promedio.
// – El porcentaje de estudiantes aprobados y el porcentaje de los reprobados.

public class Tester {
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
    
             
            SistemaNotas s = new SistemaNotas(notas);
            s.ordenarNotas();               
             Nota[] notasP = s.getNotas();
             for(int i=0; i < notasP.length;i++){
                System.out.println("Alumno " + (i+1)+": " + notasP[i].getNombre() + "| Nota: " + notasP[i].getValor());
             }

             double notaPromedio = s.calcularNotaPromedio();
             System.out.println("La nota promedio es: " + notaPromedio);

             //para obtener las notas mas altas y mas bajas, como ya est;a ordenado las mas altas las últimas
             // las mas bajas las primeras, verificar si varios estudiantes cumplen.
             boolean imprimir = true;
             for(int i = 0; i < notasP.length && imprimir==true;i++){
                if(notasP[i].getValor() == notasP[0].getValor()){
                    System.out.println("La mas baja de: " + notasP[i].getValor() + " Obtenida por : " + notasP[i].getNombre());
                }
                else{
                     imprimir = false;
                } 
             }

             imprimir = true;
             for(int i = notasP.length-1; i > 0 && imprimir==true;i--){
                if(notasP[i].getValor() == notasP[notasP.length-1].getValor()){
                    System.out.println("La mas alta de: " + notasP[i].getValor() + " Obtenida por : " + notasP[i].getNombre());
                }
                else{
                     imprimir = false;
                } 
             }

             int cantidadEstudiantesAlto = s.puntajesMayores17();
             System.out.println("Los cantidad de estudiantes con notas altas es de : " + cantidadEstudiantesAlto);
             
             int notasArribaPromedio = s.notasMayoresPromedio();
             System.out.println("Las notas mayores al promedio son : " + notasArribaPromedio);

             System.out.println(s.porcentajeAprobados());
     
    }
}
