package dos.Ejercicio6;

import java.util.Scanner;

public class CafeteraService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    public void menu(Cafetera cafetera){
        int opcion = 0;
        do {
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("1 - Llenar cafetera");
            System.out.println("2 - Vaciar cafetera");
            System.out.println("3 - Agregar Cafe");
            System.out.println("4 - Servir taza");
            System.out.println("5 - Salir");
            System.out.println("");
            System.out.println("Cafe(ml): " + cafetera.getCantidadActual());

            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    llenarCafetera(cafetera);
                    break;
                case 2:
                    vaciarCafetera(cafetera);
                    break;
                case 3:
                    agregarCafe(cafetera);
                    break;
                case 4:
                    servirTaza(cafetera);
                    break;
            }
        }while (opcion != 5);
    }

    public void llenarCafetera(Cafetera cafetera){
        System.out.println("¿Desea llenar la cafetera?(Y/N");
        String respuesta = read.next();
        if (respuesta.equalsIgnoreCase("Y")){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("La cafetera se lleno con exito");
            menu(cafetera);
        }else if (cafetera.getCapacidadMaxima() == cafetera.getCantidadActual()){
            System.out.println("La cafetera ya esta llena");
            menu(cafetera);
        }else if (respuesta.equalsIgnoreCase("N")){
           menu(cafetera);
        }
    }

    public void vaciarCafetera(Cafetera cafetera){
        System.out.println("¿Desea vaciar la cafetera?(Y/N)");
        String respuesta = read.next();
        if (respuesta.equalsIgnoreCase("Y")){
            cafetera.setCantidadActual(0);
            System.out.println("La cafetera se vacio con exito");
            menu(cafetera);
        }else if (cafetera.getCantidadActual() == 0){
            System.out.println("La cafetera ya esta vacia");
            menu(cafetera);
        }else if (respuesta.equalsIgnoreCase("N")){
            menu(cafetera);
        }
    }

    public void agregarCafe(Cafetera cafetera) {
        int cafe ;
        int cafeActual = cafetera.getCantidadActual();
        do {
            System.out.println("Ingrese la cantidad de cafe a ingresar");
            cafe = cafeActual + read.nextInt();
            if (cafe > 3000) {
                int cafe1 = cafe - cafetera.getCapacidadMaxima();
                System.out.println("Usted se ha excedido del cafe por : " + cafe1 + "mlts");
            }
        } while (cafe > cafetera.getCapacidadMaxima());
        cafetera.setCantidadActual(cafe);
        System.out.println("La cafetera se ha cargado correctamente");
    }

    public void servirTaza(Cafetera cafetera){
        System.out.println("Ingrese tamaño de la taza a llenar");
        int tazavacia = read.nextInt();
        if (cafetera.getCantidadActual() < tazavacia){
            System.out.println("La taza no se lleno, se ha ingresado : "+ cafetera.getCantidadActual() + " de mlts");
            menu(cafetera);
            cafetera.setCantidadActual(0);
            menu(cafetera);
        }else {
            System.out.println("La taza se lleno con exito");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tazavacia);
            menu(cafetera);
        }
    }
}
