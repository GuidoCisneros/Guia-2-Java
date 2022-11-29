package dos.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangulo medidas = new Rectangulo();
        crearRectangulo(medidas);
        calcularSuperficie(medidas);
        calcularArea(medidas);
        imprimirRectangulo(medidas);
    }

    private static void crearRectangulo(Rectangulo medidas) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        medidas.setBase(read.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        medidas.setAltura(read.nextInt());
    }
    private static void calcularArea(Rectangulo medidas) {
        int area = medidas.getBase() * medidas.getAltura();
        System.out.println("El area del rectangulo es de " + area);
    }
    private static void calcularSuperficie(Rectangulo medidas) {
        int superficie = (medidas.getBase() + medidas.getAltura()) *2;
        System.out.println("La superficie del rectangulo es de " + superficie);
    }
    private static void imprimirRectangulo(Rectangulo medidas) {
        for (int i = 1; i <= medidas.getAltura(); i++){
            System.out.println(" ");
            for (int j = 1; j <= medidas.getBase(); j++){
                if (!(i != 1 && j != 1 && medidas.getAltura() != i && medidas.getBase() !=j)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}
