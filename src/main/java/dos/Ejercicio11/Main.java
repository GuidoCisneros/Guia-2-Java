package dos.Ejercicio11;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long diff;

        System.out.println("ingrese el dia");
        int dia = read.nextInt();
        System.out.println("ingrese el mes");
        int mes = read.nextInt();
        System.out.println("ingrese el año");
        int anio = read.nextInt();

        Date date = new Date((anio - 1900), (mes - 1), dia);
        Date dateActual = new Date();

        System.out.println(date);

        System.out.println("fecha actual: " + dateActual);

        diff = dateActual.getYear() - date.getYear();

        System.out.println("La diff de las fechas es de : " + diff);

    }
}
