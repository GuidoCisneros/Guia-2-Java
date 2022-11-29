package dos.EjercicioEx6;

import java.util.Scanner;

public class AhorcadoService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    public void juego(Ahorcado ahorcado){
        crearjuego(ahorcado);
    }
    public void crearjuego(Ahorcado ahorcado){
        System.out.println("Ingrese la palabra a descifrar");
        String palabra = read.next();
        String[] colgado = new String[palabra.length()];
        for (int x = 0; x < palabra.length();x++){
            colgado[x] = palabra.substring(x,(x+1));
        }
        ahorcado.setDescifrar(colgado);
        System.out.println("Ingrese cantidad de jugadas");
        ahorcado.setJugadas(read.nextInt());
        buscar(colgado,ahorcado);
    }
    public void buscar(String[] colgado, Ahorcado ahorcado) {
        int found = 0;
        int count;
        do {
            System.out.println("Letra a buscar: ");
            String letra = read.next();
            count = 0;
            for (int x = 0; x < colgado.length; x++) {
                if (colgado[x].equals(letra)) {
                    count++;
                }
            }
            longitud(ahorcado);
            if (count > 0) {
                System.out.println("La letra pertenece a la palabra");
            } else {
                System.out.println("La letra no pertenece a la palabra");
            }
            found = found + count;
            intentos(encontradas(count,found,colgado), ahorcado);
        } while (ahorcado.getJugadas() != 0 && found < colgado.length);
        if(found == colgado.length){
            System.out.println("Felicidades a desifrado la palabra");
        }
    }
    public void longitud(Ahorcado ahorcado){
        int tamaño = ahorcado.getDescifrar().length;
        System.out.println("Longitud de la palabra: " + tamaño);
    }
    private boolean encontradas(int count, int found, String[] colgado) {
        if (count == 0){
            System.out.println("Numero de letras(encontradas,faltantes): " + found + ',' + (colgado.length - found));
            return false;
        }else {
            System.out.println("Numero de letras(encontradas,faltantes): " + found + ',' + (colgado.length - found));
            return true;
        }
    }
    public int intentos(boolean encontradas, Ahorcado ahorcado){
        if (encontradas == true){
            System.out.println("Numero de oportunidades restantes: " + ahorcado.getJugadas());
        }else {
            ahorcado.setJugadas(ahorcado.getJugadas()-1);
            System.out.println("Numero de oportunidades restantes: " + ahorcado.getJugadas());
        }
        if (ahorcado.getJugadas()== 0){
            System.out.println("Ya no quedan intentos");
        }
        return ahorcado.getJugadas();
    }
}
