package dos.Ejericicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacion calculo = new Operacion();
        creaOperacion(calculo);
        System.out.println("La suma de los numeros da: " + sumar(calculo));
        System.out.println("La resta de los numeros da: " + restar(calculo));
        System.out.println("La multiplicacion de los numeros da: " + multiplicar(calculo));
        System.out.println("La division de los numeros da: " + dividir(calculo));
    }

    public static void creaOperacion(Operacion calculo) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros");
        calculo.setNumero1(read.nextInt());
        calculo.setNumero2(read.nextInt());
    }

    public static int sumar(Operacion calculo) {
        int suma = calculo.getNumero1() + calculo.getNumero2();
        return suma;
    }

    public static int restar(Operacion calculo) {
        int resta = calculo.getNumero1() - calculo.getNumero2();
        return resta;
    }

    public static String multiplicar(Operacion calculo) {
        if (calculo.getNumero1() == 0 || calculo.getNumero2() == 0 ){
            String mensaje = "Error, no se puede multiplicar a/por 0";
            return mensaje;
        }else {
            int multiplica = calculo.getNumero1() * calculo.getNumero2();
            return String.valueOf(multiplica);
        }
    }

    public static String dividir(Operacion calculo) {
        if (calculo.getNumero1() == 0 || calculo.getNumero2() == 0 ){
            String mensaje = "Error, no se puede dividir a/por 0";
            return mensaje;
        }else {
            int divida = calculo.getNumero1() / calculo.getNumero2();
            return String.valueOf(divida);
        }
    }
}
