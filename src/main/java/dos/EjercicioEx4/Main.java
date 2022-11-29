package dos.EjercicioEx4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nif nif = new Nif();
        NifService nifService = new NifService();
        nifService.crearNif(nif);
        nifService.mostrar(nif);
    }
}
