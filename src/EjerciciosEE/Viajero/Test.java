package EjerciciosEE.Viajero;
//Un viajero conoce todos los gastos que hizo en
// su último viaje con la tarjeta de crédito, fueron 18 en
// total, los cuales se pueden clasificar en cuatro tipos:
// comida, hospedaje, transporte y ropa. Escriba un
// algoritmo, que haga uso de vectores, y le permita al
// viajero determinar:
// – Gastos totales discriminados por tipo.
// – Cantidad de gastos que realizó en comida.
// – Tipo de gasto en el que más invirtió dinero en el viaje.

public class Test {

    public static void main(String[] args) {
        Ropa obj1 = new Ropa(200);
        Ropa obj2 = new Ropa(180);
        Ropa obj3 = new Ropa(190);
        Ropa obj4 = new Ropa(170);
        Transporte obj5 = new Transporte(50);
        Transporte obj6 = new Transporte(40);
        Comida obj7 = new Comida(30);
        Comida obj8 = new Comida(20);
        Hospedaje obj9 = new Hospedaje(100);
        Hospedaje obj10 = new Hospedaje(90);
        Hospedaje obj11 = new Hospedaje(80);
        Ropa obj12 = new Ropa(150);
        Ropa obj13 = new Ropa(120);
        Comida obj14 = new Comida(50);
        Transporte obj15 = new Transporte(60);
        Ropa obj16 = new Ropa(75);
        Ropa obj17 = new Ropa(85);
        Ropa obj18 = new Ropa(110);

        Gastos[] gastos = {
            obj1,obj2,obj3,obj4,obj5,obj6,obj7,obj8,obj9,obj10,obj11,obj12,
            obj13,obj14,obj15,obj16,obj17,obj18
        };
        
        Viajero v = new Viajero(gastos);

        v.calcularGastos();
        int cantidadGastosComida = v.getCantidadGastosComida();
        String gastoMayor = v.mayorTipoDeGasto();
        System.out.println("Gastos por concepto de Comida: " + v.getGastosComida());
        System.out.println("Gastos por concepto de Hospedaje: " + v.getGastosHospedaje());
        System.out.println("Gastos por concepto de Transporte: " + v.getGastosTransporte());
        System.out.println("Gastos por concepto de Ropa: " + v.getGastosRopa());

        System.out.println("Cantidad de gastos en Comida: " + cantidadGastosComida);
        System.out.println(gastoMayor);
    }
    
}
