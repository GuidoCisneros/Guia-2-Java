package dos.Ejercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        CadenaService cadenaService = new CadenaService();
        Cadena cadena = new Cadena();
        Cadena cadena2 = new Cadena();
        cadenaService.ingreseFrase(cadena);
        cadenaService.mostrarVocales(cadena);
        cadenaService.invertirFrase(cadena);
        cadenaService.vecesRepetido(cadena);
        System.out.println("¿Desea ingresar otra frase?");
        System.out.println("Si es no, espacio+enter");
        cadenaService.ingreseFrase(cadena2);
        cadenaService.mostrarVocales(cadena2);
        cadenaService.invertirFrase(cadena2);
        cadenaService.vecesRepetido(cadena2);
        cadenaService.compararLongitud(cadena,cadena2);
        cadenaService.unirFrases(cadena,cadena2);
    }
}
