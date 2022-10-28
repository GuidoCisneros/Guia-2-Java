package dos.Ejericicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circunferencia calculo = new Circunferencia();
        crearCircunferencia(calculo);
        area(calculo);
        perimetro(calculo);
    }

    public static void crearCircunferencia(Circunferencia calculo) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese radio");
        calculo.setRadio(read.nextInt());
    }
    public static void area(Circunferencia calculo) {
        double area = (Math.pow(calculo.getRadio(),2) * 3.14);
        System.out.println("El area es: " + area);
    }
    public static void perimetro(Circunferencia calculo){
        double perimetro = 2 * 3.14 * calculo.getRadio() ;
        System.out.println("El perimetro es: " + perimetro);
    }
}
