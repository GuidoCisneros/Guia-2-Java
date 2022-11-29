package dos.Ejercicio6;

import java.util.Scanner;

public class Main {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        CafeteraService cafeteraService = new CafeteraService();
        cafeteraService.menu(cafetera);
    }
}