package dos.Ejercicio8;

import java.util.Scanner;

public class CadenaService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void ingreseFrase(Cadena cadena){
        System.out.println("Ingrese frase");
        cadena.setFrase(read.next());
        cadena.setLongitud(cadena.getFrase().length());
    }

    public void mostrarVocales(Cadena cadena){
        int count = 0;
        String letraFrase;
        for (int x=0;x< cadena.getLongitud(); x++){
            letraFrase = String.valueOf(cadena.getFrase().charAt(x));
            if (letraFrase.equalsIgnoreCase("a") || letraFrase.equalsIgnoreCase("e") ||
                    letraFrase.equalsIgnoreCase("i") || letraFrase.equalsIgnoreCase("o") || letraFrase.equalsIgnoreCase("u")){
                count++;
            }
        }
        System.out.println("Numero de vocales en la frase:" + count);
    }

    public void invertirFrase(Cadena cadena){
        for (int x = (cadena.getLongitud() -1); x >= 0; x--){
            System.out.print(cadena.getFrase().charAt(x));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena cadena){
        int count = 0;
        System.out.println("Ingrese letra que desee verificar su repeticion");
        String letra = read.next();
        String letraFrase;
        for (int x=0;x< cadena.getLongitud(); x++){
            letraFrase = String.valueOf(cadena.getFrase().charAt(x));
            if (letraFrase.equalsIgnoreCase(letra)){
                count++;
            }
        }
        if (count<=1){
            System.out.println("No hay repeticiones");
        }else {
            System.out.println(letra + " se repite:" + count);
        }
    }

    public void compararLongitud(Cadena cadena, Cadena cadena2){
        int comparacion;
        if (cadena.getLongitud() > cadena2.getLongitud()){
            comparacion = cadena.getLongitud() - cadena2.getLongitud();
            System.out.println("La primer frase es mayor por " + comparacion + " caracteres.");
        }else if (cadena.getLongitud() < cadena2.getLongitud()){
            comparacion = cadena2.getLongitud() - cadena.getLongitud();
            System.out.println("La segunda frase es mayor por " + comparacion + " caracteres.");
        }else {
            System.out.println("Ambas frases tienen las misma cantidad de caracteres");
        }
    }

    public void unirFrases(Cadena cadena, Cadena cadena2){
        String cadenaf = cadena.getFrase() + " " + cadena2.getFrase();
        System.out.println(cadenaf);
        reemplazar(cadenaf);
        contiene(cadenaf);
    }

    public void reemplazar(String cadenaf){
        System.out.println("Ingrese simbolo para reemplazar la letra a");
        String simbolo = read.next();
        String letraFrase;
        for (int x=0;x< cadenaf.length(); x++){
            letraFrase = String.valueOf(cadenaf.charAt(x));
            if (letraFrase.equalsIgnoreCase("a")){
                letraFrase = simbolo;
            }
            System.out.print(letraFrase);
        }
        System.out.println("");
    }

    public boolean contiene(String cadenaf){
        System.out.println("Ingrese la letra a buscar");
        String opcion = read.next();
        String letraFrase;
        int count = 0;
        for (int x=0;x< cadenaf.length(); x++){
            letraFrase = String.valueOf(cadenaf.charAt(x));
            if (letraFrase.equalsIgnoreCase(opcion)){
                count++;
            }
        }
        if (count >= 1){
            System.out.println("Contiene la letra");
            return true;
        }else {
            System.out.println("No contiene la letra");
            return false;
        }
    }
}
