package dos.EjercicioEx5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String mes[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre" };
        String mesSecreto = mes [(int) ((Math.random()*12)-1)];
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        String mesAdivina = read.next();
        while (!mesAdivina.equals(mesSecreto)){
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mesAdivina = read.next();
        }
        System.out.println("¡Ha acertado!");
    }
}
